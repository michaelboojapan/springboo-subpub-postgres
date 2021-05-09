package com.mericari.merpay.pubsub.controller;

import com.mericari.merpay.pubsub.dto.Mesg;
import com.mericari.merpay.pubsub.dto.Publisher;
import com.mericari.merpay.pubsub.dto.Subscriber;
import com.mericari.merpay.pubsub.dto.Topic;
import com.mericari.merpay.pubsub.service.PublisherService;
import java.util.List;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@EnableAutoConfiguration
//@RequestMapping("/publisher")
public class PublisherController {

  private PublisherService publisherService;

  public PublisherController(PublisherService publisherService) {
    this.publisherService = publisherService;
  }

  @GetMapping("/")
  public String init(Model model) {
    List<Publisher> publishers = publisherService.selectAllPublisher();
    List<Subscriber> subscribers = publisherService.selectAllSubscriber();
    model.addAttribute("publishers", publishers);
    model.addAttribute("subscribers", subscribers);
    return "index";
  }

  @GetMapping("/topic")
  public String selectTopic(Model model, @RequestParam String pubName) {
    List<Topic> topics = publisherService.selectTopic(pubName);
    model.addAttribute("pubName", pubName);
    model.addAttribute("topics", topics);
    return "topic";
  }

  @PostMapping("/registerTopic")
  public RedirectView registerTopic(Topic topic, Errors errors) {
    if (errors.hasErrors()) {
      throw new RuntimeException((Throwable) errors);
    }
    publisherService.registerTopic(topic);

    return new RedirectView("/topic?pubName=" + topic.getPubName());
  }

  @GetMapping("/mesg")
  public String selectMesg(Model model, @RequestParam String topicName) {
    List<Mesg> mesgs = publisherService.selectMesg(topicName);
    model.addAttribute("topicName", topicName);
    model.addAttribute("mesgs", mesgs);
    return "mesg";
  }


  @PostMapping("/publishMessage")
  public RedirectView publishMessage(Mesg mesg, Errors errors) {
    if (errors.hasErrors()) {
      throw new RuntimeException((Throwable) errors);
    }
    publisherService.publishMessage(mesg);

    return new RedirectView("/mesg?topicName=" + mesg.getTopicName());
  }
}
