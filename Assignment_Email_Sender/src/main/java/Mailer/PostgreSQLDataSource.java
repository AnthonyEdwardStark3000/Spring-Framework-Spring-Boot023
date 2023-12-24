package Mailer;

import org.springframework.stereotype.Component;

@Component
public class PostgreSQLDataSource implements DataSource{
    public void sendMail(String mail){
        System.out.println("Mail sent from POSTGRE SQL\t"+mail);
    }
}
