package Mailer;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{

    @Override
    public void sendMail(String mail) {
        System.out.println(mail);
    }
}
