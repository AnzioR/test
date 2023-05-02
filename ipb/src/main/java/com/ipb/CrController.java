package com.ipb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrController {
  @RequestMapping("/cr")
  public String cr() {
    return "채란입니다.";
  }
}
