package com.mericari.merpay.pubsub.dto;

import javax.validation.constraints.NotNull;

public class Publisher {
  public Publisher() {
  }

  private String pubName;

  public String getPubName() {
    return pubName;
  }

  public void setPubName(String pubName) {
    this.pubName = pubName;
  }
}
