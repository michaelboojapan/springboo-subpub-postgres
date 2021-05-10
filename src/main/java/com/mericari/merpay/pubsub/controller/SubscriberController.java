package com.mericari.merpay.pubsub.controller;

import com.mericari.merpay.pubsub.dto.Mesg;
import com.mericari.merpay.pubsub.dto.Subscriber;
import com.mericari.merpay.pubsub.dto.Subscriber;
import com.mericari.merpay.pubsub.dto.Topic;
import com.mericari.merpay.pubsub.service.SubscriberService;
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
public class SubscriberController {

  private SubscriberService subscriberService;

  public SubscriberController(SubscriberService subscriberService) {
    this.subscriberService = subscriberService;
  }


  @GetMapping("/subscriptionTopic")
  public String selectTopic(Model model, @RequestParam String subName) {
    List<Topic> topics = subscriberService.selectSubscriptionTopic(subName);
    List<Mesg> mesgs = subscriberService.selectSubscriptionMesgs(subName);
    model.addAttribute("subName", subName);
    model.addAttribute("topics", topics);
    model.addAttribute("mesgs", mesgs);
    return "subscription-topic";
  }

  @PostMapping("/subscribeTopic")
  public RedirectView subscribeTopic(Topic topic, Errors errors) {
    if (errors.hasErrors()) {
      throw new RuntimeException((Throwable) errors);
    }
    subscriberService.subscribeTopic(topic);

    return new RedirectView("/subscriptionTopic?subName=" + topic.getSubName());
  }

  @GetMapping("/acknowledge")
  public RedirectView acknowledge(int msgId, String subName) {
    subscriberService.acknowledge(msgId, subName);
    return new RedirectView("/subscriptionTopic?subName=" + subName);
  }
}
