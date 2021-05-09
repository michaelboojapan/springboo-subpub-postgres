package com.mericari.merpay.pubsub.mapper;

import com.mericari.merpay.pubsub.dto.Mesg;
import com.mericari.merpay.pubsub.dto.Publisher;
import com.mericari.merpay.pubsub.dto.Topic;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublisherMapper {

  List<Publisher> selectAll();

  List<Topic> selectTopic(String pubId);

  void registerTopic(Topic topic);

  List<Mesg> selectMesg(String topicId);

  void publishMessage(Mesg mesg);
}
