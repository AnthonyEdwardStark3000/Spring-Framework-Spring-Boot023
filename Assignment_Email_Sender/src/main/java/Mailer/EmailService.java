package Mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class EmailService{
    @Autowired
    @Qualifier("mySQLDataSource")
    private DataSource mysql;

    @Autowired
    @Qualifier("postgreSQLDataSource")
    private DataSource posgre;

    public void receiveMail() {
        System.out.println("This is to inform you that ");
        System.out.println(Arrays.toString(this.mysql.sendMail()));
        System.out.println("Calling the postgre sql ....");
        System.out.println(Arrays.toString(this.posgre.sendMail()));
    }
}
