package org.unndevs.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
  private Long id;

  private Long getId() {
    return id;
  }

  private void setId(final Long id) {
    this.id = id;
  }
}
