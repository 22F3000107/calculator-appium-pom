# Calculator Appium Automation Project

## Overview

This project automates a native Android Calculator application using Appium with Java and TestNG following the Page Object Model (POM) design pattern.

The framework performs and validates basic arithmetic operations:

* Addition
* Subtraction
* Multiplication
* Division

---

## Tech Stack

* Java
* Appium
* Maven
* TestNG
* Android Studio
* Android Emulator

---

## Project Structure

```text
calculator-appium-pom
│
├── src/test/java/com/calculator
│   ├── config
│   │   ├── DriverManager.java
│   │   └── TestConfig.java
│   │
│   ├── pages
│   │   └── CalculatorPage.java
│   │
│   └── tests
│       └── CalculatorTest.java
│
├── pom.xml
├── testng.xml
├── README.md
```

---

## Features

* Mobile Calculator Automation
* Page Object Model (POM)
* TestNG Assertions
* Maven Dependency Management
* Exception Handling
* Pass/Fail Logging

---

## Test Scenarios

| Operation      | Input  | Expected Result |
| -------------- | ------ | --------------- |
| Addition       | 7 + 3  | 10              |
| Subtraction    | 10 - 4 | 6               |
| Multiplication | 5 × 6  | 30              |
| Division       | 20 ÷ 4 | 5               |

---

## Prerequisites

Install the following before running the project:

* Java 17
* Maven
* Node.js
* Appium Server
* Android Studio
* Android Emulator

---

## Setup Instructions

### 1. Clone Repository

```bash
git clone https://github.com/your-username/calculator-appium-pom.git
```

---

### 2. Install Dependencies

```bash
mvn clean install
```

---

### 3. Start Appium Server

```bash
appium
```

---

### 4. Start Android Emulator

Open Android Studio and run an Android Emulator.

---

### 5. Run Tests

```bash
mvn test
```

---

## Framework Design

This project follows the Page Object Model (POM) design pattern:

* Page classes contain UI element methods
* Test classes contain test scenarios and assertions
* Config classes manage driver setup and teardown

---

## Author

Deepak Kumar
