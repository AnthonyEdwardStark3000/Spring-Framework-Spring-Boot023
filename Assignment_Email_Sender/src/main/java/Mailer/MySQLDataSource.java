package Mailer;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{
    private String[] mails = {"Hello","Good Morning","Good afternoon", "Good evening", "Good night"};
    @Override
    public String[] sendMail() {
        System.out.println("From Mysql data Source");
        return mails;
    }
}
