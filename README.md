# Spring Boot Global Exception Handling

A Spring Boot web application demonstrating how to centrally manage exceptions using `@ControllerAdvice` and render custom error pages using Thymeleaf.

## Features
* **Global Error Interception:** Catches exceptions across all controllers without repetitive `try-catch` blocks.
* **Custom Exception Handling:** Dedicated routing for custom business exceptions (`CustomException`).
* **Dynamic Error Views:** Uses Thymeleaf templates to inject specific error messages into user-friendly `400 Bad Request` and `500 Internal Server Error` HTML pages.

## Technologies Used
* Java
* Spring Boot (Web MVC)
* Thymeleaf

## How to Test
Run the application and navigate to the following endpoints in your browser:
1. **Trigger an ArithmeticException:**
   `http://localhost:8080/divide/10divideBy0`
   *(Expected Result: Renders the 400 Bad Request page)*
2. **Trigger a CustomException:**
   `http://localhost:8080/custom`
   *(Expected Result: Renders the 400 Bad Request page with a custom message)*