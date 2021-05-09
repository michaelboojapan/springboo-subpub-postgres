package com.mericari.merpay.pubsub.mapper;

import com.mericari.merpay.pubsub.dto.Mesg;
import com.mericari.merpay.pubsub.dto.Publisher;
import com.mericari.merpay.pubsub.dto.Subscriber;
import com.mericari.merpay.pubsub.dto.Topic;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubscriberMapper {

  List<Topic> selectSubscriptionTopic(String subName);

  List<Mesg> selectSubscriptionMesgs(String subName);

  void subscribeTopic(Topic topic);

  void acknowledge(int msgId, String subName);
}
