**Open/Closed Principle (OCP) - Notification System**

The Open/Closed Principle states:

"Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification."

This means that we should be able to add new functionality without modifying existing code. Instead of altering existing classes, we should design our system to allow new behaviors through extension (inheritance, interfaces, or polymorphism).

**2. The Problem: OCP Violation in Notification System**
   Initially, we might create a NotificationService class that directly implements all notification methods like Email, SMS, and Push Notification.

🚨 Why is this a problem?
Every time we add a new notification type (e.g., WhatsApp, Slack), we must modify the NotificationService class.
This violates OCP, as the class is not closed for modification and requires changes every time a new notification type is added.

**3. The Solution: OCP-Compliant Design**
   ✅ Refactored Approach:
   Create an interface Notification → This ensures that all notification types implement a common contract.
   Implement separate classes for each notification type (Email, SMS, Push Notification).
   Use dependency injection to allow NotificationService to send notifications without knowing their internal details.

