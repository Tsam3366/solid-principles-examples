You're designing a Reporting System where different types of reports can be generated.

PDFReport → Can be exported as a file.
EmailReport → Can be sent via email but does not need file export.
Currently, EmailReport extends Report but throws an exception if exportToFile() is called.