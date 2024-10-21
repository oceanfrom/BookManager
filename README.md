# Simple Library Management System

This is a simple Library Management System built with Spring MVC, JDBC, and Thymeleaf. The system allows users to manage books and people in a library, assign books to people, and perform CRUD operations.

## Features

- **Books Management**: Add, edit, delete, and view books in the library.
- **People Management**: Add, edit, delete, and view people who borrow books.
- **Book Assignment**: Assign books to people and release them back to the library.
- **Thymeleaf Templates**: Dynamic views with Thymeleaf for the book and people management.

## Technologies Used

- **Spring MVC**: For building the web application.
- **JDBC (Java Database Connectivity)**: For database interaction.
- **Thymeleaf**: For server-side Java templating.
- **Maven**: For project management and dependency management.

## Usage

### Books
- **View all books**: Navigate to `/book` to see all books in the library.
- **Add a new book**: Go to `/book/new` and fill out the form to add a new book.
- **Edit a book**: Visit `/book/{id}/edit` to edit a specific book.
- **Delete a book**: Click the delete button on the book detail page.

### People
- **View all people**: Navigate to `/people` to see all people registered in the system.
- **Add a new person**: Go to `/people/new` to add a new person.
- **Edit a person**: Visit `/people/{id}/edit` to edit a specific person's details.
- **Delete a person**: Click the delete button on the person detail page.

### Assign and Release Books
- **Assign a book**: On a book's detail page, select a person and assign the book.
- **Release a book**: On a book's detail page, click **"Release the book"** to make it available again.
