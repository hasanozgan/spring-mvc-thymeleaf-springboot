package com.hasanozgan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/secure")
public class SecureController {

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public String getSecurePage() {
    return "secure";
  }

}
