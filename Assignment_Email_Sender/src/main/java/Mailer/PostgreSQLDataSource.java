package Mailer;

import org.springframework.stereotype.Component;

@Component
public class PostgreSQLDataSource implements DataSource{
    private String[] mails = {"Happy christmas","Happy new year","Happy Pongal"};

    public String[] sendMail(){
        System.out.println("From PostgreSQL dataSource");
        return mails;
    }
}
