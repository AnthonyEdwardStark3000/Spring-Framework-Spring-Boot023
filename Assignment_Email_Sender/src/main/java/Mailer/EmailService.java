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
    public String[] sendMail() {
        System.out.println("This is to inform you that ");
        return this.posgre.sendMail();
//        System.out.println("Calling the postgre sql ....");
//        this.posgre.sendMail();
//        return new String[0];
    }
}
