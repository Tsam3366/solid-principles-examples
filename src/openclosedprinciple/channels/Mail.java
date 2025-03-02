package openclosedprinciple.channels;

import openclosedprinciple.service.ISendMessage;

public class Mail implements ISendMessage {

    private String to;
    private String msg;

    public Mail(String to,String msg){
        this.to=to;
        this.msg=msg;
    }

    @Override
    public String sendMessage() {
        return "To : "+to+"\nMail: \n"+msg+ "\n through mail";
    }
}
