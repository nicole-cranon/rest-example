package com.examples.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by U999716 on 3/24/2017.
 */
@Controller
public class HelloController {
  @RequestMapping("/hello")
  public String hello(Model model, @RequestParam(value="name", required=false, defaultValue = "World") String name) {
    model.addAttribute("name", name);
    return "hello";
  }
}
