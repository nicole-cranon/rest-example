package com.examples.webapp.controllers;

import com.examples.webapp.model.HelloForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by U999716 on 3/24/2017.
 */
@Controller
public class HelloController {
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello(Model model, @RequestParam(value="name", required=false, defaultValue = "World") String name) {
    model.addAttribute("name", name);
    return "hello";
  }

  @RequestMapping(value = "/helloform", method = RequestMethod.GET)
  public ModelAndView helloForm() {
    return new ModelAndView("helloForm", "command", new HelloForm());
  }

  @RequestMapping(value = "/helloform", method = RequestMethod.POST)
  public String helloForm (@ModelAttribute HelloForm helloForm, ModelMap model) {
    model.addAttribute("firstName", helloForm.firstName);
    model.addAttribute("lastName", helloForm.lastName);

    return "helloFormResult";
  }
}
