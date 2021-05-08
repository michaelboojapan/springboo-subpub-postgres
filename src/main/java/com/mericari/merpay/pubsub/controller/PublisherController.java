package com.mericari.merpay.pubsub.controller;

import com.mericari.merpay.pubsub.dto.Publisher;
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

  //  @PostMapping
  //  public Publisher post(@Validated @RequestBody Publisher customer, Errors errors) {
  //    // If the fields of requested customer object are invalid,
  //    // throw Runtime Exception with validation errors.
  //    // NOTE: You can set HTTP status code and return it instead of throwing error.
  //    if (errors.hasErrors()) {
  //      throw new RuntimeException((Throwable) errors);
  //    }
  //    // NOTE: You can also validate whether insertion succeeded or not here.
  //    return customerService.register(customer);
  //  }
}
