package com.fmi.learnspanish.web.rest.controller;

import com.fmi.learnspanish.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/learn")
public class LearnController {

  @Autowired
  private UserService userService;

  @GetMapping("/grammar/{email}")
  public ModelAndView getGrammar(@PathVariable String email, ModelAndView modelAndView) {
    // userService.checkUserExistence(email);
    modelAndView.setViewName("learn/grammar.html");
    return modelAndView;
  }

  @GetMapping("/vocabulary/{email}")
  public ModelAndView getVocabulary(@PathVariable String email, ModelAndView modelAndView) {
    // userService.checkUserExistence(email);
    modelAndView.setViewName("learn/vocabulary.html");
    return modelAndView;
  }

  @GetMapping("/practice/{email}")
  public ModelAndView getPractice(@PathVariable String email, ModelAndView modelAndView) {
    // userService.checkUserExistence(email);
    modelAndView.setViewName("learn/practice.html");
    return modelAndView;
  }

}
