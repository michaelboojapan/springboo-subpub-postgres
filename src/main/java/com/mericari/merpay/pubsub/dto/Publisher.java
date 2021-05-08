package com.mericari.merpay.pubsub.dto;

import javax.validation.constraints.NotNull;

public class Publisher {
  public Publisher() {
  }

  @NotNull
  private String pubId;

  @NotNull
  private String pubName;

  public String getPubId() {
    return pubId;
  }

  public void setPubId(String pubId) {
    this.pubId = pubId;
  }

  public String getPubName() {
    return pubName;
  }

  public void setPubName(String pubName) {
    this.pubName = pubName;
  }
}
