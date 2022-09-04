package com.devonfw.application.domain.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.devonfw.application.domain.validation.EmailExtended;
import com.devonfw.application.domain.validation.Phone;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Visitor entity.
 */
@Entity
@Table(name = "Visitor")
@Getter
@Setter
public class VisitorEntity extends ApplicationPersistenceEntity {

  @NotNull
  @EmailExtended
  private String username;

  @NotNull
  private String name;

  @NotNull
  @Phone
  private String phoneNumber;

  private String password;

  @Column(name = "acceptedCommercial")
  private Boolean acceptedCommercial;

  @Column(name = "acceptedTerms")
  private Boolean acceptedTerms;

  @Column(name = "userType")
  private Boolean userType;
}
