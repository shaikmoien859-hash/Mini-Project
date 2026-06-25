# Appointment Booking System

## 📌 Project Overview

The Appointment Booking System is a simple Java console application that allows users to view available appointment slots, book appointments, and view booked appointments. The project demonstrates the use of Java collections, loops, conditional statements, and menu-driven programming.

## 🚀 Features

* View available appointment slots
* Book an appointment from available slots
* Automatically remove booked slots from available slots
* View all booked appointments
* Simple menu-driven interface
* Prevents double booking of the same slot

## 🛠️ Technologies Used

* Java
* ArrayList
* Scanner Class
* Object-Oriented Programming Concepts

## 📂 Project Structure

```plaintext
AppointmentBookingSystem/
│
├── AppointmentBookingSystem.java
└── README.md
```

## ⚙️ How It Works

The system starts with predefined appointment slots:

* 09:00 AM
* 10:00 AM
* 11:00 AM
* 02:00 PM
* 03:00 PM

Users can:

1. View available slots.
2. Select a slot to book.
3. View booked appointments.
4. Exit the application.

Once a slot is booked, it is removed from the available slots list and added to the booked appointments list.

## ▶️ Running the Program

### Compile

```bash
javac AppointmentBookingSystem.java
```

### Run

```bash
java AppointmentBookingSystem
```

## 📋 Sample Output

```text
=== Appointment Booking System ===
1. View Available Slots
2. Book Appointment
3. View Booked Appointments
4. Exit
Enter choice: 1

Available Slots:
1. 09:00 AM
2. 10:00 AM
3. 11:00 AM
4. 02:00 PM
5. 03:00 PM
```

### Booking an Appointment

```text
Select a Slot:
1. 09:00 AM
2. 10:00 AM
3. 11:00 AM
4. 02:00 PM
5. 03:00 PM

Enter slot number: 2

Appointment booked for 10:00 AM
```

### Viewing Booked Appointments

```text
Booked Appointments:
10:00 AM
```

## 🔍 Concepts Demonstrated

* Java ArrayList
* Menu-Driven Programs
* User Input Handling
* Data Management
* Conditional Statements
* Loops and Iteration

## 🎯 Future Enhancements

* Store customer names
* Appointment cancellation feature
* Appointment rescheduling
* File or database storage
* Admin login system
* GUI using Java Swing or JavaFX

## 👨‍💻 Author

Developed as a Java Mini Project to demonstrate appointment scheduling and booking functionality using core Java concepts.

## 📄 License

This project is open-source and available for educational purposes.
