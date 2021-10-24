package com.soyjuanmedina.spring5tutorial.mail;

import javax.mail.MessagingException;

public interface MailSender {

  String send(String to, String subject, String body) throws MessagingException;

}
