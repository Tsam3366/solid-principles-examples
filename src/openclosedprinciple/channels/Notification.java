package openclosedprinciple.channels;

import openclosedprinciple.service.ISendMessage;

public class Notification implements ISendMessage {
    private String to;
    private String msg;

    public Notification(String to, String msg) {
        this.to = to;
        this.msg = msg;
    }

    @Override
    public String sendMessage() {
        return "To : "+to+"\nMail: \n"+msg+ "\n through Notification";
    }
}
