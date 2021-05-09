package com.mericari.merpay.pubsub.service;

import com.mericari.merpay.pubsub.dto.Mesg;
import com.mericari.merpay.pubsub.dto.Subscriber;
import com.mericari.merpay.pubsub.dto.Subscriber;
import com.mericari.merpay.pubsub.dto.Topic;
import com.mericari.merpay.pubsub.mapper.SubscriberMapper;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {
  private SubscriberMapper mapper;

  public SubscriberService(SubscriberMapper mapper) {
    this.mapper = mapper;
  }

  public List<Topic> selectSubscriptionTopic(String subName) {
    return mapper.selectSubscriptionTopic(subName);
  }
  public List<Mesg> selectSubscriptionMesgs(String subName) {
    return mapper.selectSubscriptionMesgs(subName);
  }

  public void subscribeTopic(Topic topic) {
    mapper.subscribeTopic(topic);
  }

  public void acknowledge(int msgId, String subName) {
    mapper.acknowledge(msgId, subName);
  }
 

}
