/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.D_Mail;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author kandskat
 */
public class L_Mail {

    public boolean send_mail(D_Mail dts) {
        try {
            Properties propert = new Properties();
            propert.put("mail.smtp.host", "smtp.live.com");
            propert.setProperty("mail.smtp.starttls.enable", "true");
            propert.setProperty("mail.smtp.port", "587");
            propert.setProperty("mail.smtp.user", dts.getUser());
            propert.setProperty("mail.smtp.auth", "true");
            
            
            Session session = Session.getDefaultInstance(propert,null);
            BodyPart Text = new MimeBodyPart();
            Text.setText(dts.getMensaje());
            BodyPart adjunto = new MimeBodyPart();
            
            if(!dts.getArchiveDir().equals(""))
            {
                adjunto.setDataHandler(new DataHandler(new FileDataSource(dts.getArchiveDir())));
                adjunto.setFileName(dts.getArchiveName());
            }
            
            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(Text);
            
            if(!dts.getArchiveDir().equals("")){
                m.addBodyPart(adjunto);
            }
            
            MimeMessage Msg = new MimeMessage(session);
            Msg.setFrom(new InternetAddress(dts.getUser()));
            Msg.addRecipient(Message.RecipientType.TO, new InternetAddress(dts.getDestine()));
            
            //usado para enviar a multipls destins de acuerdo
            //a lo insertd en arrai multipldst del tipo Internt addrs
            //InternetAddress[] multipldstn = new InternetAddress[]{new InternetAddress(""),new InternetAddress("")};
            //Mmensaje.addRecipients(Message.RecipientType.TO, multipldstn);
                    
            Msg.setSubject(dts.getAsunto());
            Msg.setContent(m);
            
            Transport t = session.getTransport("smtp");
            t.connect(dts.getUser(), dts.getPassword());            
            t.sendMessage(Msg, Msg.getAllRecipients());
            t.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
}
