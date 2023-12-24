package Mailer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {
    public static void main(String[] args) {
        String mail = "Merry X-Mas";
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = applicationContext.getBean(EmailService.class);
        emailService.sendMail(mail);
    }
}
