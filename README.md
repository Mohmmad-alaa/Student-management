Student Management System
Overview

The Student Management System is a Java-based application designed to manage student records efficiently. This project includes features for adding, updating, and removing student information, as well as viewing detailed student records.
Features

    Add new student records
    Update existing student information
    Delete student records
    View all students' details

Technologies Used
Java

    Version: JDK 8 or higher
    Description: The primary programming language used for developing the application. Java is a widely-used, object-oriented language known for its portability and performance.

Maven

    Version: 3.6.0 or higher
    Description: A build automation tool used primarily for Java projects. It helps manage project dependencies, build lifecycle, and documentation.

Spring MVC

    Description: A framework used for building web applications in Java. It follows the Model-View-Controller design pattern and provides a clean separation between the presentation, business, and data access layers.

JSP (JavaServer Pages)

    Description: Used for creating dynamically generated web pages based on HTML, XML, or other document types. JSP helps in embedding Java code in HTML pages.

JDBC (Java Database Connectivity)

    Description: An API for connecting and executing queries with the database. JDBC enables the application to interact with a wide range of databases.

JavaScript

    Description: A client-side scripting language used to create dynamic content and interactive web pages. JavaScript enhances the user experience by enabling client-side validation and interactive features.

CSS

    Description: Used for styling the application’s user interface. CSS allows for a clean and visually appealing design, ensuring a better user experience.

IDE (Integrated Development Environment)

    Eclipse or IntelliJ IDEA: Recommended IDEs for developing and managing the project. They provide tools and features that facilitate code writing, debugging, and project management.

Project Structure

bash

Student-management/
│
├── .settings/            # Eclipse settings files
├── src/                  
│   └── main/             # Main source code directory
├── target/               # Compiled bytecode and other build outputs
├── .classpath            # Eclipse classpath settings file
├── .project              # Eclipse project settings file
├── pom.xml               # Maven Project Object Model file

Getting Started
Prerequisites

    Java Development Kit (JDK) 8 or higher
    Maven 3.6.0 or higher
    An IDE such as Eclipse or IntelliJ IDEA

Installation

    Clone the repository:

    sh

git clone https://github.com/Mohmmad-alaa/Student-management.git

Navigate to the project directory:

sh

cd Student-management

Build the project using Maven:

sh

    mvn clean install

Running the Application

    Open the project in your preferred IDE.
    Run the main method from the appropriate class to start the application
