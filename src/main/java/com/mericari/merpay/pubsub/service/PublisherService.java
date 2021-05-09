package com.mericari.merpay.pubsub.service;

import com.mericari.merpay.pubsub.dto.Mesg;
import com.mericari.merpay.pubsub.dto.Publisher;
import com.mericari.merpay.pubsub.dto.Subscriber;
import com.mericari.merpay.pubsub.dto.Topic;
import com.mericari.merpay.pubsub.mapper.PublisherMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {
  private PublisherMapper mapper;

  public PublisherService(PublisherMapper mapper) {
    this.mapper = mapper;
  }

  public List<Publisher> selectAllPublisher() {
    return mapper.selectAllPublisher();
  }

  public List<Subscriber> selectAllSubscriber() {
    return mapper.selectAllSubscriber();
  }

  public List<Topic> selectTopic(String pubName) {
    return mapper.selectTopic(pubName);
  }

  public void registerTopic(Topic topic) {
    mapper.registerTopic(topic);
  }

  public List<Mesg> selectMesg(String topicName) {
    return mapper.selectMesg(topicName);
  }

  public void publishMessage(Mesg mesg) {

    mapper.publishMessage(mesg);
  }

}
