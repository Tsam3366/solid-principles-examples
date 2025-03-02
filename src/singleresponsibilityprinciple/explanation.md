Single Responsibility Principle (SRP) - Bank Account Example
1. Understanding the Single Responsibility Principle (SRP)
   The Single Responsibility Principle (SRP) is one of the five SOLID principles of object-oriented programming. It states:

        "A class should have only one reason to change."
This means that a class should only have one responsibility and should not perform multiple unrelated tasks. If a class handles more than one responsibility, it becomes harder to maintain, modify, and test.

**2. The Problem: SRP Violation in BankAccount Class**
   In our initial design, the BankAccount class is performing two distinct responsibilities:

**Managing account data and transactions**

Storing account details (account number, balance)
Performing deposits and withdrawals
Generating account statements

Printing account details
Formatting and displaying account reports
📌 Why is this a problem?

If we need to change the way transactions work (e.g., adding interest calculations), the class will also be impacted by changes in how reports are generated.
This violates SRP, as the class has multiple reasons to change.

**3. The Solution: SRP-Compliant Design**
   To follow the Single Responsibility Principle, we need to separate the reporting logic from the BankAccount class.

✅ Refactored Approach:

BankAccount → Handles only account data and transactions.
AccountStatementGeneration → Handles only account statement generation.
This ensures that each class has a single responsibility, making the code more maintainable, testable, and scalable.

