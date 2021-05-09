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

  public List<Topic> selectSubscriptionTopic(String subId) {
    return mapper.selectSubscriptionTopic(subId);
  }
  public void subscribeTopic(Topic topic) {

    mapper.subscribeTopic(topic);
  }
 

}
