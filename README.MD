# Online Book Store Application
- The Online Book Store is a simple web application that allows users to browse, search, and order books online. This application is built using the Spring Boot framework to create a RESTful API for managing books in an in-memory database. 
- Users can interact with the API using cURL or any other HTTP client.

# Features
- Get a list of all books in the store.
- Get details of a specific book by its ID.
- Add a new book to the store.
- Update an existing book's information.
- Delete a book from the store.

# Prerequisites
## Before running the application, ensure you have the following installed on your system:

- **Java Development Kit** (JDK) 11 or later
- **Eclipse IDE** (or any other Java IDE)
- **cURL** (optional, for testing the API via command-line)

# Getting Started
## Clone the repository:
    git clone <repository_url>

- Import the project into Eclipse (or your preferred Java IDE) as a Maven project.

# Run the application:

- Right-click on the project in the Eclipse Project Explorer.
- Select "Run As" -> "Spring Boot App."
- The application will start on localhost and use port 8080 by default. You can change these settings in the application.properties file if needed.

# API Endpoints
## The following are the available API endpoints for interacting with the Online Book Store application:

- **GET /api/books**: Get a list of all books in the store.
- **GET /api/books/{id}**: Get details of a specific book by its ID.
- **POST /api/books**: Add a new book to the store. (Requires JSON payload with book details)
- **PUT /api/books/{id}**: Update an existing book's information by its ID. (Requires JSON payload with updated book details)
- **DELETE /api/books/{id}**: Delete a book from the store by its ID.

# Sample cURL Commands
## Here are some sample cURL commands to test the API endpoints:

### Get all books:
    curl -X GET http://localhost:8080/api/books
### Get a specific book by ID (replace {id} with the actual book ID):
    curl -X GET http://localhost:8080/api/books/{id}
### Add a new book:
    curl -X POST http://localhost:8080/api/books -H "Content-Type: application/json" -d "{\"title\":\"Book Title\",\"author\":\"Author Name\",\"isbn\":\"978-1234567890\",\"price\":29.99}"
### Update a book (replace {id} with the actual book ID):
    curl -X PUT http://localhost:8080/api/books/{id} -H "Content-Type: application/json" -d "{\"title\":\"Updated Title\",\"author\":\"Updated Author\",\"isbn\":\"978-0987654321\",\"price\":19.99}"
### Delete a book (replace {id} with the actual book ID):
    curl -X DELETE http://localhost:8080/api/books/{id}