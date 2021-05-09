package com.mericari.merpay.pubsub.dto;

import javax.validation.constraints.NotNull;

public class Subscriber {
  public Subscriber() {
  }

  @NotNull
  private String subId;

  @NotNull
  private String subName;

  public String getSubId() {
    return subId;
  }

  public void setSubId(String subId) {
    this.subId = subId;
  }

  public String getSubName() {
    return subName;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }
}
