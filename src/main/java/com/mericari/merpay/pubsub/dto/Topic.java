package com.mericari.merpay.pubsub.dto;

import javax.validation.constraints.NotNull;

public class Topic {
  public Topic() {
  }

  private int pubId;

  private int subId;

  private int topicId;

  private String topicName;

  public int getPubId() {
    return pubId;
  }

  public void setPubId(int pubId) {
    this.pubId = pubId;
  }

  public int getSubId() {
    return subId;
  }

  public void setSubId(int subId) {
    this.subId = subId;
  }

  public int getTopicId() {
    return topicId;
  }

  public void setTopicId(int topicId) {
    this.topicId = topicId;
  }

  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

}
