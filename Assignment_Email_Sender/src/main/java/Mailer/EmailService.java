package Mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements DataSource{
    @Autowired
    @Qualifier("mySQLDataSource")
    private DataSource mysql;

    @Autowired
    @Qualifier("postgreSQLDataSource")
    private DataSource posgre;
    @Override
    public void sendMail(String mail) {
        System.out.println("This is to inform you that ");
        this.mysql.sendMail(mail);
        System.out.println("Calling the postgre sql ....");
        this.posgre.sendMail(mail);
    }
}
