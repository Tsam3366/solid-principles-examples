**Liskov Substitution Principle (LSP) - Reporting System**
1. Understanding the Liskov Substitution Principle (LSP)
   LSP states:

"Subtypes must be substitutable for their base types without altering the correctness of the program."

This means that a child class should not break the behavior expected from the parent class.

2. The Problem: LSP Violation in Reporting System
   We initially design a Report class and extend it with PDFReport and EmailReport.

🚨 What is wrong?
PDFReport supports file export (exportToFile() ✅).
EmailReport does not need file export, but since it extends Report, it must implement exportToFile(), even though it doesn't make sense.
To handle this, EmailReport throws an exception in exportToFile(), which violates LSP because:
Calling exportToFile() on a Report instance should always work.
EmailReport is not truly substitutable for Report.

3. The Solution: Refactoring for LSP Compliance
   ✅ Refactored Approach:
   Separate functionalities using two interfaces:
   FileExportableReport (for reports that can be exported as files).
   EmailableReport (for reports that can be sent via email).
   Make PDFReport implement FileExportableReport.
   Make EmailReport implement EmailableReport.
   Now, no method in a class will throw an exception unexpectedly!