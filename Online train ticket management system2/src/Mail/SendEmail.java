
package Mail;

/**
 *
 * @author Nishat-dadi
 */

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

   public static void main(String [] args) {
       
       String to="animazama17@gmail.com";
        String from="nishatnoman1999@gmail.com";
 
      Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
    props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
    
  Session session = Session.getInstance(props, new javax.mail.Authenticator() {
  
       protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("nishatnoman1999@gmail.com","123");
            }
        });
   try {

           Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));//ur email
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));//u will send to
            message.setSubject("This is text subject line");
            message.setText("this");
            Transport.send(message);
            System.out.println("Sent message successfully...");

        } catch (MessagingException e) {
           //mex.printStackTrace();
           System.out.println(e);
        }
    
  
  }
          
   }



