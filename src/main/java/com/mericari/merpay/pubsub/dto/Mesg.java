package com.mericari.merpay.pubsub.dto;


public class Mesg {
  public Mesg() {
  }

  private int msgId;

  private String topicId;

  private String msgContent;

  public int getMsgId() {
    return msgId;
  }

  public void setMsgId(int msgId) {
    this.msgId = msgId;
  }

  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }

  public String getMsgContent() {
    return msgContent;
  }

  public void setMsgContent(String msgContent) {
    this.msgContent = msgContent;
  }
}
