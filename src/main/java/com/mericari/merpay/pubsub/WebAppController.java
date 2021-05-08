package com.mericari.merpay.pubsub;

import ch.qos.logback.core.net.SyslogOutputStream;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@EnableAutoConfiguration
public class WebAppController {

  @GetMapping("/")
  public String init() {
    return "hello";
  }

  @PostMapping("/publishmsg")
  public String publishmsg(Model model, @RequestParam("message") String message) {
    model.addAttribute("msg", "publish msg");
    return "hello";
  }

  @GetMapping("/getmsg")
  public String getmsg(Model model) {
    model.addAttribute("msg", "get msg");
    return "hello";
  }
}
