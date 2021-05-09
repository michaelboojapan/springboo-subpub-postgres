package com.mericari.merpay.pubsub.dto;

import javax.validation.constraints.NotNull;

public class Topic {
  public Topic() {
  }

  private String pubName;

  private String subName;

  private String topicName;

  public String getPubName() {
    return pubName;
  }

  public void setPubName(String pubName) {
    this.pubName = pubName;
  }

  public String getSubName() {
    return subName;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }

  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

}
