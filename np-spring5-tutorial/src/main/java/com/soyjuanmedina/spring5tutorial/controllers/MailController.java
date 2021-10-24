package com.soyjuanmedina.spring5tutorial.controllers;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soyjuanmedina.spring5tutorial.mail.MailSender;

@RestController
public class MailController {

  private MailSender mailSender;

  public MailController(MailSender mailSender) {
    this.mailSender = mailSender;
  }

  @RequestMapping("/mail")
  public String sendMail() throws MessagingException {
    String type = mailSender.send("soyjuanmedina@gmail.com", "Lo que sea", "el mensaje");
    return "Mail sent del tipo " + type;
  }

}
