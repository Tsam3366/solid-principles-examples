package liskovsubstitutionprinciple.reportservice;

import liskovsubstitutionprinciple.reporttypes.Mail;

public class EmailReport implements Mail {
    private String to;
    private String filename;

    public EmailReport(String to,String filename){
        this.to=to;
        this.filename=filename;
    }


    @Override
    public void sendMail() {
        System.out.println(filename +" File sending to "+to);
    }
}
