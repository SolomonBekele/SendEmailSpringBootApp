# Email Service

This project demonstrates how to send emails using the Java Mail API with Spring Boot. It supports sending emails with attachments, setting the sender's name and email, and configuring values dynamically from the `application.yml` file.

## Features
- Send emails to one or more recipients.
- Support for CC (carbon copy) recipients.
- Attach multiple files to the email.
- Dynamically configure sender email and display name from `application.yml`.
- Exception handling for runtime errors.

## Prerequisites

- Java 11 or higher
- Gradle
- Spring Boot dependencies:
  - `spring-boot-starter-mail`
  - `spring-boot-starter`

## Configuration

### Add Email Settings to `application.yml`

Define the sender email and other mail-related settings in `application.yml`:

```yaml
mail:
  host: smtp.gmail.com
  port: 587
  username: your-email@gmail.com
  password: your-email-password
  protocol: smtp
  properties:
    mail:
      smtp:
        auth: true
        starttls.enable: true
```

> **Note:** Replace `your-email@gmail.com` and `your-email-password` with the credentials for the email account you want to use for sending emails.


