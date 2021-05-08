package com.mericari.merpay.pubsub.service;

import com.mericari.merpay.pubsub.dto.Publisher;
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

  //  @Override
  //  public Publisher register(Publisher customer) {
  //    String formattedEmail = formatEmail(customer.getEmail());
  //    customer.setEmail(formattedEmail);
  //
  //    mapper.insert(customer);
  //    return customer;
  //  }

}
