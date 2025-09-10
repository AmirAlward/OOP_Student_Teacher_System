OOP Student-Teacher Management System (Java)
Project Overview

This is a console-based Java application that manages students and teachers with role-specific operations. Users can enter personal details, update information, and manage role-specific data such as GPA, study level, salary, bonuses, and working hours.

The project was designed to practice Object-Oriented Programming (OOP) concepts including classes, inheritance, encapsulation, and polymorphism. It demonstrates how to create modular and reusable code while handling complex menu-driven interactions.

Features

Role-Based Menu System

Student menu: Personal info, study info (GPA, study level)

Teacher menu: Personal info, teaching info (subject, class number)

Teacher categories: Hourly or Monthly paid with salary management

Dynamic Data Management

Edit personal info: name, ID, email, phone, age

Edit academic info: GPA, study level

Edit salary info: salary, bonus, working hours

OOP Concepts Applied

Classes and objects: Person, Student, Teacher, Hourly_T, Monthly_T, App

Inheritance: Student and Teacher extend Person

Polymorphism: Overridden menu methods for Teacher subclasses

Encapsulation: Private fields with getters/setters

Getting Started
Prerequisites

Java JDK 8 or higher installed

IDE or text editor (Eclipse, IntelliJ IDEA, NetBeans, VS Code with Java extension)

How to Run

Clone the repository or download the project files.

Open the project in your Java IDE.

Compile all .java files.

Run App.java to start the program.

Navigate the console menus using the indicated letters (a, b, e, etc.).

Usage Example

Choose user type: Student (a) or Teacher (b)

Enter first name, last name, and ID

For students: manage personal info or study info

For teachers: select category (Hourly/Monthly) and manage personal, teaching, or salary info

Exit any menu by pressing e

Screenshots

(Add screenshots of your console here)

student_menu.png – Shows student menu

teacher_menu.png – Shows teacher menu

salary_menu.png – Shows teacher salary menu

Skills Demonstrated

Java OOP: Classes, Objects, Inheritance, Polymorphism, Encapsulation

Modular programming and structured code

Problem-solving and logical thinking

Console-based UI design

Future Improvements

Add file-based data storage to save info between sessions

Implement GUI version using JavaFX

Add validation checks for inputs (e.g., valid email, ID, GPA range)

License

This project is free to use for learning purposes.