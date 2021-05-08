package com.mericari.merpay.pubsub.dto;

import javax.validation.constraints.NotNull;

public class Topic {
  public Topic() {
  }

  private String pubId;

  private String topicId;

  @NotNull
  private String topicName;

  public String getPubId() {
    return pubId;
  }

  public void setPubId(String pubId) {
    this.pubId = pubId;
  }

  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }

  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }
}
