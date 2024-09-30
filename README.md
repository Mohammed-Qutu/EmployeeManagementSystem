# EmployeeManagementSystem

## Description
This Java project demonstrates object-oriented programming concepts like inheritance and polymorphism by using a `Person` base class and an `Employee` derived class. The program stores a list of `Person` and `Employee` objects in an array and prints their details using the overridden `toString()` method. This project highlights how inheritance allows for code reuse and the ability to extend classes with additional functionality.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `EmployeeManagementApp.java`, `Person.java`, and `Employee.java` files, and execute the `EmployeeManagementApp` class. The program will print the details of both `Person` and `Employee` objects, demonstrating the inheritance structure.

### Example Output
Name: Bob Phone: 123-456-7890 Email: alice@example.com

Name: Jeff Phone: 214-399-2034 Email: bob@example.com

Name: Carl Phone: 333-444-5555 Email: Carl@gmail.com Employee Number: 1234-5678

Name: David Phone: 666-777-8888 Email: David@yahoo.com Employee Number: 5678-9012

### Key Features:
- **`Person` Class**: Represents a generic person with attributes such as name, phone number, and email.
- **`Employee` Class**: Inherits from `Person` and adds an employee number to the attributes.
- **Polymorphism**: The program uses polymorphism to handle objects of both `Person` and `Employee` types in the same array.
- **Method Overriding**: The `Employee` class overrides the `toString()` method to display additional information.

### Methods:
- **Person Class**:
  - `getName()`, `getPhoneNumber()`, `getEmail()`: Getters for `Person` attributes.
  - `toString()`: Returns a string representation of the `Person` object.
- **Employee Class**:
  - `getEmployeeNumber()`: Returns the employee number.
  - `toString()`: Overrides the `Person` class's `toString()` to include the employee number.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
