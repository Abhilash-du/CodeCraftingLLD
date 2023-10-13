# Parking Lot Management System

This project is an online parking lot management system designed to efficiently manage parking spaces in a multi-floor parking lot. The system allows users to seamlessly find available parking spots, enter the lot, and make payments through various methods. Below are the key features and requirements of the system:

## Table of Contents
- [Use Case Diagram](#use-case-diagram)
- [System Requirements](#system-requirements)
- [Parking Lot Features](#parking-lot-features)
- [Payment Options](#payment-options)
- [Parking Spots](#parking-spots)
- [Fee Structure](#fee-structure)

## Use Case Diagram

```plaintext
 [User] --> (Enter Parking Lot)
 (User) --> (Exit Parking Lot)
 (User) --> (Pay for Parking)
 (User) --> (Check Spot Availability)
```

## System Requirements

- **Multiple Floors**: The parking lot should have multiple levels for parking.
- **Entry and Exit Gates**: There should be multiple entry and exit gates for convenient access.
- **Ticketing System**: Users must collect a ticket upon entry, which serves as a record of their parking duration.
- **Payment Options**: Payments can be made at exit counters, dedicated automated payment booths on each floor, or online.
- **Payment Methods**: Payment can be made in cash, by credit card, or through UPI.
- **Real-time Availability**: The system must display parking spot availability at the entry gate.
- **Parking Spot Types**: The parking lot consists of three types of parking spots: Large, Medium, and Small.
- **Spot Validation**: Vehicles can only park in designated spots of the appropriate size.
- **Floor Status Displays**: Each floor should have a display board showing the current status of available spots.
- **Fee Calculation**: The fee is calculated based on a per-hour pricing model.

## Parking Lot Features

### Multiple Floors
The parking lot is organized into multiple floors to accommodate a large number of vehicles.

### Multiple Entries and Exits
There are multiple entry and exit gates for efficient access and egress.

### Ticketing System
Upon entering the parking lot, users need to collect a ticket, which includes the entry time and date.

### Payment Options
Users can make payments through different methods, including:
- Cash payment at the exit counter to the parking attendant.
- Automated payment booths located on each floor.
- Online payment using credit card or UPI.

### Payment Methods
The system supports various payment methods, ensuring user convenience:
- Cash
- Credit Card
- UPI

### Real-time Availability
The system constantly monitors parking spot availability and displays the information at the entry gate. This allows users to determine if a spot is available before entering.

### Parking Spots
The parking lot is equipped with spots of three types:
- **Small**: Designed for compact cars.
- **Medium**: Suitable for mid-sized vehicles.
- **Large**: Reserved for larger vehicles.
Vehicles can only be parked in spots that match their size category.

### Floor Status Displays
Each floor is equipped with a display board showing the status of available parking spots, making it easier for users to find a parking space.

### Fee Structure
The fee for parking is calculated based on a per-hour pricing model. Here are the rates for each spot type:
- Small: ₹50 for the first hour, ₹80 per additional hour.
- Medium: ₹80 for the first hour, ₹100 per additional hour.
- Large: ₹100 for the first hour, ₹120 per additional hour.

This project aims to provide an efficient and user-friendly solution for managing parking spaces in a multi-floor parking lot. Users can easily find parking, make payments, and track spot availability, ensuring a smooth parking experience.

For any further details or questions, please refer to the use case diagram or contact the project's maintainers.

---

**Note**: To view the use case diagram mentioned above, please check the `use-case-diagram.png` file in this repository.
