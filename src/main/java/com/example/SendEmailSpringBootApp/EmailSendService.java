package com.example.SendEmailSpringBootApp;

import org.springframework.web.multipart.MultipartFile;
public interface EmailSendService {
    String sendMail(MultipartFile[] file, String to,String[] cc, String subject, String body);
}
