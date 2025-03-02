# SOLID Principles

## Overview
SOLID is a set of five design principles intended to make software more maintainable, scalable, and robust. These principles help in creating software that is easy to understand, modify, and extend.

### 1. **Single Responsibility Principle (SRP)**
- A class should have only one reason to change.
- Each class should only have one job or responsibility.
- Example: Separating account data management from account statement generation in a banking system.

### 2. **Open/Closed Principle (OCP)**
- A class should be open for extension but closed for modification.
- New functionality should be added via extension rather than altering existing code.
- Example: A notification system that supports Email, SMS, and Push notifications without modifying existing classes.

### 3. **Liskov Substitution Principle (LSP)**
- Objects of a derived class must be substitutable for objects of the base class without altering program correctness.
- A subclass should enhance, not break or replace, the behavior of its superclass.
- Example: A reporting system where `PDFReport` can be exported as a file, but `EmailReport` should not inherit from `Report` if it does not support file export.
(Eg. for 4 th and 5th one will be upload soon!!!)
### 4. **Interface Segregation Principle (ISP)**
- Clients should not be forced to depend on interfaces they do not use.
- Large interfaces should be broken down into smaller, more specific ones.
- Example: A report system having separate interfaces for exporting (`ReportExport`) and sending emails (`MailSender`) instead of one large interface.

### 5. **Dependency Inversion Principle (DIP)**
- High-level modules should not depend on low-level modules; both should depend on abstractions.
- Abstractions should not depend on details; details should depend on abstractions.
- Example: Instead of directly depending on a `MySQLDatabase`, a system should depend on an abstract `Database` interface, making it easier to swap out database implementations.

By following SOLID principles, developers can write software that is modular, testable, and easy to extend while minimizing bugs and maintenance costs.
