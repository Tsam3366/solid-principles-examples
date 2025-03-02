package openclosedprinciple.Main;

import openclosedprinciple.service.ISendMessage;
import openclosedprinciple.channels.Mail;
import openclosedprinciple.channels.SMS;
import openclosedprinciple.service.SendMessageService;

public class Application {
    public static void main(String[] args) {
        SendMessageService sendMessageService= new SendMessageService();

        ISendMessage mail=new Mail("sam","Hello Sam");
        ISendMessage sms=new SMS("sam","Hello Sam");

        System.out.println(sendMessageService.sendMessage(mail));
        System.out.printf(sendMessageService.sendMessage(sms));
    }
}
