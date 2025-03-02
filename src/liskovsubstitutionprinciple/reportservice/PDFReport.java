package liskovsubstitutionprinciple.reportservice;

import liskovsubstitutionprinciple.reporttypes.Report;

public class PDFReport implements Report {
    private String filename;
    public PDFReport(String filename) {
        this.filename = filename;
    }


    @Override
    public void fileExport() {
        System.out.println(filename+" File Exported");
    }
}

