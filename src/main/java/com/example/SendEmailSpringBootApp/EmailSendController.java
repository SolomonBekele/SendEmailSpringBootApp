package com.example.SendEmailSpringBootApp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/mail")
public class EmailSendController {
    private final EmailSendService emailSendService;

    public EmailSendController(EmailSendService emailSendService) {
        this.emailSendService = emailSendService;
    }

    @PostMapping("/send")
    public String sendMail(@RequestParam(value = "file", required = false) MultipartFile[] file, String to, String[] cc, String subject, String body) {
        return emailSendService.sendMail(file, to, cc, subject, body);
    }
}
