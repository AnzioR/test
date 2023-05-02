package com.ipb;

import org.springframework.web.bind.annotation.RequestMapping;

public class MjController {
  @RequestMapping("/hello")
  public String hello(){
    return "HiHi 👻";
  }
}
