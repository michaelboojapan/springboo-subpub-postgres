package com.mericari.merpay.pubsub.service;

import com.mericari.merpay.pubsub.dto.Mesg;
import com.mericari.merpay.pubsub.dto.Publisher;
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

  public List<Publisher> selectAll() {
    return mapper.selectAll();
  }

  public List<Topic> selectTopic(String pubId) {
    return mapper.selectTopic(pubId);
  }

  public void registerTopic(Topic topic) {

    mapper.registerTopic(topic);
  }


  public List<Mesg> selectMesg(String topicId) {
    return mapper.selectMesg(topicId);
  }
  public void publishMessage(Mesg mesg) {

    mapper.publishMessage(mesg);
  }

}
