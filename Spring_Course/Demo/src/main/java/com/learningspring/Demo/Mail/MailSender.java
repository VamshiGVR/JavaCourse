package com.learningspring.Demo.Mail;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class MailSender {
    public static void main(String[] args) {
        String host = "smtp.example.com";  // SMTP server (e.g., smtp.gmail.com)
        final String username = "your-email@example.com";
        final String password = "your-password";
        String to = "recipient@example.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Test Email");
            message.setText("Hello, this is a test email from Java!");

            Transport.send(message);
            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
