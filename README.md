# OOP Student-Teacher Management System

A **Java console application** that allows management of **students and teachers** using **Object-Oriented Programming concepts** like inheritance, encapsulation, and polymorphism.

## Features

- Add and manage **Student information**:
  - Personal info (name, ID, age, email, phone)
  - Study info (study level, GPA)
- Add and manage **Teacher information**:
  - Personal info (name, ID, age, email, phone)
  - Teaching info (subject, class number, salary)
  - Two categories: **monthly paid** and **hourly paid**
- Edit and update all personal and professional information via interactive menus.
- Easy-to-use **console interface** with nested menus for better organization.

## Classes Overview

- **Person**: Base class with personal info.
- **Student**: Inherits from `Person`, adds study info.
- **Teacher**: Inherits from `Person`, adds teaching info.
- **Monthly_T / Hourly_T**: Extend `Teacher` to handle different salary types.
- **App**: Main class with interactive menu to manage students and teachers.

## How to Run

1. Make sure you have **Java JDK** installed.
2. Clone the repository:
   ```bash
   git clone https://github.com/AmirAlward/OOP_Student_Teacher_System.git
Navigate to the src folder:

bash
Copy code
cd OOP_Student_Teacher_System/src
Compile the Java files:

bash
Copy code
javac *.java
Run the application:

bash
Copy code
java App
Screenshots
(Optional: Add screenshots of your program running here)

GitHub Repository
OOP Student-Teacher Management System

Author: Amir Alward
Course: Object-Oriented Programming (Java)