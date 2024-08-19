# Java Calculator

This is a simple calculator project written in Java, which allows performing basic mathematical operations such as addition, subtraction, multiplication, and division. The project was developed following object-oriented programming best practices, focusing on scalability, maintainability, and ease of understanding.

## Features

- **Addition**: Adds two numbers.
- **Subtraction**: Subtracts one number from another.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides one number by another, with handling for division by zero.

## Project Structure

The project is divided into two main classes:

1. **Calculator**: The main class that manages interaction with the user, requesting the numbers and the operator.
2. **CalculatorService**: The service class that contains the business logic to perform the calculations based on the provided numbers and operator.

### Classes

- **Calculator**
  - `main(String[] args)`: Entry point of the program.
  - `requestNumber(Scanner scanner, String message)`: Requests a number from the user.
  - `requestOperator(Scanner scanner, String message)`: Requests an operator from the user.

- **CalculatorService**
  - `calculate(double num1, double num2, char operator)`: Performs the calculation based on the provided operator.
  - `isOperatorValid(char operator)`: Checks if the provided operator is valid.

## Prerequisites

To run this project, you need to have **Java 8** or higher installed on your machine.

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/calculator-java.git
    cd calculator-java
    ```

2. **Compile the code**:
    ```bash
    javac Calculator.java
    ```

3. **Run the program**:
    ```bash
    java Calculator
    ```

4. **Interact with the program**:
    - Enter the first number when prompted.
    - Choose an operator (`+`, `-`, `*`, `/`).
    - Enter the second number.
    - The result will be displayed in the console.

## Usage Examples

**Input**: 
  Enter the first number: 10
  Enter the operator (+, -, *, /): *
  Enter the second number: 5

**Output**:
  The result is: 50.0

In this example, the user chose to multiply 10 by 5, resulting in 50.0.

## Error Handling

The program handles some common error scenarios, such as:

- **Invalid input**: If the user enters a non-numeric value when a number is requested, the program will prompt again until a valid number is entered.
- **Invalid operator**: If the user enters an operator that is not `+`, `-`, `*`, or `/`, the program will prompt for a valid operator.
- **Division by zero**: If the user tries to divide a number by zero, the program will throw an exception indicating that this operation is not allowed.

## Code Structure

The code was developed following best programming practices, using variable names in English to ensure an international standard, while the user interaction messages are in Brazilian Portuguese. The separation between presentation logic and business logic was implemented to facilitate the maintainability and scalability of the project.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an *issue* or submit a *pull request*.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
