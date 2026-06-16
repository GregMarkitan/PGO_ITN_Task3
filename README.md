# Cafe Order Management System (Java OOP Exercise)



## Overview



This is a simple console-based Java application for managing a small cafe system.  



The system allows you to:

- Create menu items

- Register a customer

- Build an order with multiple items

- Calculate total order value

- Print readable summaries

- Compare objects using `equals()`



---



## Project Structure



src/

- Main.java

- MenuItem.java

- CafeCustomer.java

- Order.java



---



## Classes Description



### MenuItem



Represents a product on the menu in the cafe.



**Fields:**

- code

- name

- price

- category

- Static metod: productCount



**Features:**

- Constructor initializes all fields

- Static method: `getProductCount()`

- Overrides `toString()`

- Overrides `equals()` (compares by `code`)



---



### CafeCustomer



Represents a customer placing orders.



**Fields:**

- customerId

- firstName

- lastName

- email



**Features:**

- Constructor initializes all data

- Method: `getFullData()`

- Overrides `toString()`

- Overrides `equals()` (compares by `customerId` or `email`)



---



### Order



Represents a customer order containing multiple items.



**Fields:**

- orderNumber

- customer (CafeCustomer)

- items (ArrayList<MenuItem>)

- paid

- static nextOrderNumber



**Features:**

- Automatically generated order numbers

- `addItem(MenuItem item)`

- `calculateTotal()`

- `countItems()`

- `markAsPaid()`

- Overrides `toString()`



