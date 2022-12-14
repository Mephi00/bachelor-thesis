package com.devonfw.application.api.model;

import java.sql.Timestamp;

import com.devonfw.module.basic.common.api.to.AbstractEto;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity transport object of Queue
 */
@Getter
@Setter
public class QueueEto extends AbstractEto {

  private static final long serialVersionUID = 1L;

  private String name;

  private String logo;

  private String currentNumber;

  private Timestamp attentionTime;

  private Timestamp minAttentionTime;

  private Boolean active;

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.logo == null) ? 0 : this.logo.hashCode());
    result = prime * result + ((this.currentNumber == null) ? 0 : this.currentNumber.hashCode());
    result = prime * result + ((this.attentionTime == null) ? 0 : this.attentionTime.hashCode());
    result = prime * result + ((this.minAttentionTime == null) ? 0 : this.minAttentionTime.hashCode());
    result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    QueueEto other = (QueueEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    if (this.logo == null) {
      if (other.logo != null) {
        return false;
      }
    } else if (!this.logo.equals(other.logo)) {
      return false;
    }
    if (this.currentNumber == null) {
      if (other.currentNumber != null) {
        return false;
      }
    } else if (!this.currentNumber.equals(other.currentNumber)) {
      return false;
    }
    if (this.attentionTime == null) {
      if (other.attentionTime != null) {
        return false;
      }
    } else if (!this.attentionTime.equals(other.attentionTime)) {
      return false;
    }
    if (this.minAttentionTime == null) {
      if (other.minAttentionTime != null) {
        return false;
      }
    } else if (!this.minAttentionTime.equals(other.minAttentionTime)) {
      return false;
    }
    if (this.active == null) {
      if (other.active != null) {
        return false;
      }
    } else if (!this.active.equals(other.active)) {
      return false;
    }
    return true;
  }
}
