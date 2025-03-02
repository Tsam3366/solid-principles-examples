package liskovsubstitutionprinciple.Main;

import liskovsubstitutionprinciple.reportservice.EmailReport;
import liskovsubstitutionprinciple.reportservice.PDFReport;
import liskovsubstitutionprinciple.reporttypes.Mail;
import liskovsubstitutionprinciple.reporttypes.Report;

public class Application {
    public static void main(String[] args) {
        Mail mail=new EmailReport("sam","Master in Java");
        Report report=new PDFReport("Report of Employee");
        mail.sendMail();
        report.fileExport();
    }
}
