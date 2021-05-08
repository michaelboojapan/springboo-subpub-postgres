package com.mericari.merpay.pubsub.controller;

import com.mericari.merpay.pubsub.dto.Publisher;
import com.mericari.merpay.pubsub.dto.Topic;
import com.mericari.merpay.pubsub.service.PublisherService;
import java.util.List;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
//@RequestMapping("/publisher")
public class PublisherController {

  private PublisherService customerService;

  public PublisherController(PublisherService customerService) {
    this.customerService = customerService;
  }

  @GetMapping("/")
  public String init(Model model) {
    List<Publisher> publishers = customerService.selectAll();
    model.addAttribute("publishers", publishers);
    return "index";
  }

  @GetMapping("/topic")
  public String selectTopic(Model model, @RequestParam String pubId) {
    List<Topic> topics = customerService.selectTopic(pubId);
    model.addAttribute("pubId", pubId);
    model.addAttribute("topics", topics);
    return "topic";
  }

  @PostMapping("/registerTopic")
  public int registerTopic(@Validated @RequestBody Topic topic, Errors errors) {
    if (errors.hasErrors()) {
      throw new RuntimeException((Throwable) errors);
    }
    return customerService.registerTopic(topic);
  }
}
