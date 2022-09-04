package com.devonfw.application.domain.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "DailyQueue")
@Getter
@Setter
@ToString(callSuper = true)
public class QueueEntity extends ApplicationPersistenceEntity {
  private String name;

  private String logo;

  @Column(name = "currentNumber")
  private String currentNumber;

  @Column(name = "attentionTime")
  private Timestamp attentionTime;

  @Column(name = "minAttentionTime")
  private Timestamp minAttentionTime;

  private Boolean active;
}
