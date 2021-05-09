package com.mericari.merpay.pubsub.dto;

import javax.validation.constraints.NotNull;

public class Subscriber {
  public Subscriber() {
  }

  private int subId;

  private String subName;

  public int getSubId() {
    return subId;
  }

  public void setSubId(int subId) {
    this.subId = subId;
  }

  public String getSubName() {
    return subName;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }
}
