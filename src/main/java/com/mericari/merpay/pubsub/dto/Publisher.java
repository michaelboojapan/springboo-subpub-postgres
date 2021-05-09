package com.mericari.merpay.pubsub.dto;

import javax.validation.constraints.NotNull;

public class Publisher {
  public Publisher() {
  }

  private int pubId;

  private String pubName;

  public int getPubId() {
    return pubId;
  }

  public void setPubId(int pubId) {
    this.pubId = pubId;
  }

  public String getPubName() {
    return pubName;
  }

  public void setPubName(String pubName) {
    this.pubName = pubName;
  }
}
