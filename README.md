# 🛒 Java Stock and Billing Management System

## 📋 Overview
This is a simple **console-based Java application** for managing product stock and billing operations. It allows administrators to add/update/delete products and manage cashier access, while cashiers can view stock or generate billing entries.

## 💡 Features
- Add, update, and delete stock items
- Track product ID, price, and quantity
- Manage cashier login and access
- Display current inventory
- Modular class design (`StockEntry`, `BillEntry`, `Main`)

## 🛠 Technology Stack
- **Language**: Java
- **IDE**: OnlineGDB / Any Java IDE
- **Concepts Used**: 
  - Object-Oriented Programming (OOP)
  - ArrayLists
  - Inheritance
  - Scanner for input handling

## 🧱 Modules
### `StockEntry`
- Handles product operations (Add, Update, Delete)
- Stores data using `ArrayList` collections

### `BillEntry`
- Inherits from `StockEntry`
- Displays stock data (acts as a basic bill generator)

### `Main`
- Manages user roles (`Owner`, `Cashier`)
- Allows admin to add cashiers and access reports
- Allows cashiers to access stock or billing modules

## 🚀 How to Run
1. Copy the code into [OnlineGDB](https://www.onlinegdb.com/) or any Java IDE.
2. Run the `Main` class.
3. Follow the console prompts to interact with the system.

## 📂 File Structure
- `Main.java` – Main driver program
- `StockEntry` – Stock management module
- `BillEntry` – Inventory viewing/billing module

## 📈 Future Improvements
- Add file/database persistence
- Implement proper billing system
- Add authentication for owner/cashier roles
- Improve UI with JavaFX or Swing

## 🏅 Certificate

This project was completed as part of a beginner-level Java certification program.

