/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author Akash
 *

/**
 * @param args the command line arguments
 */
import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class JavaMail {

    /**
     Outgoing Mail (SMTP) Server
     requires TLS or SSL: smtp.gmail.com (use authentication)
     Use Authentication: Yes
     Port for TLS/STARTTLS: 587
     */
    public void sendMail(String body,ArrayList<String> emailS) {
        final String fromEmail = "akash.dholaria@sitpune.edu.in"; //requires valid gmail id
        final String password = "ghatiyamail"; // correct password for gmail id
        //final String toEmail = "bhoomika.jethwani@sitpune.edu.in"; // can be any email id

        System.out.println("SSLEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
        props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
        props.put("mail.smtp.port", "465"); //SMTP Port

        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        Session session = Session.getDefaultInstance(props, auth);
        System.out.println("Session created");

        for(String toEmail:emailS)
        {
            sample.EmailUtil.sendEmail(session, toEmail,"Airport Notification!", body);
        }
        //
        //sample.EmailUtil.sendEmail(session, "gauri.nigam@sitpune.edu.in","Airport Notification!", body);
    }

}

