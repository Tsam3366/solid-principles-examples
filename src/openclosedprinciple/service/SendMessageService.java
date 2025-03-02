package openclosedprinciple.service;

public class SendMessageService {
    public String sendMessage(ISendMessage iSendMessage){
        return iSendMessage.sendMessage();
    }
}
