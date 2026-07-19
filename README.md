# 🛒 Easy-Mart
## Full Stack E-Commerce Web Application

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk">
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot">
  <img src="https://img.shields.io/badge/React.js-61DAFB?style=for-the-badge&logo=react&logoColor=black">
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
  <img src="https://img.shields.io/badge/JWT-Authentication-black?style=for-the-badge">
</p>

<p align="center">
A secure Full Stack E-Commerce platform built using <b>Spring Boot</b>, <b>React.js</b>, <b>MySQL</b>, <b>Spring Security</b>, and <b>JWT Authentication</b>.
</p>

---

# 📖 Project Overview

Easy-Mart is a full-stack e-commerce web application that provides separate interfaces for **Customers** and **Vendors**.

Customers can browse products, search and filter items, and purchase products, while vendors can securely manage categories, products, and inventory through role-based authentication.

The project follows a layered architecture using Spring Boot REST APIs and React.js frontend applications.

---

# ✨ Features

## 🔐 Authentication

- User Registration
- Secure Login
- JWT Authentication
- Spring Security
- BCrypt Password Encryption
- Role-Based Authorization
- Protected REST APIs

---

## 👤 Customer Features

- User Login
- Browse Products
- Search Products
- Product Listing
- Responsive UI

---

## 🏪 Vendor Features

- Vendor Login
- Add Category
- Add Sub Category
- Add Product
- Update Product
- Manage Products

---

# 🛠 Tech Stack

| Frontend | Backend | Database | Tools |
|----------|----------|----------|-------|
| React.js | Java 17 | MySQL | Git |
| Bootstrap 5 | Spring Boot | Hibernate | GitHub |
| React Router DOM | Spring Security | Spring Data JPA | Postman |
| Axios | JWT Authentication | | IntelliJ IDEA |
| React Hook Form | Maven | | VS Code |

---

# 🏗 System Architecture

```text
React Customer App
          │
React Vendor App
          │
          ▼
      REST APIs
          │
          ▼
 Spring Boot Backend
          │
          ▼
 Spring Security
          │
          ▼
 JWT Authentication
          │
          ▼
    MySQL Database
```

---

# 📂 Repository Structure

```text
Easy-Mart
│
├── customer/                # React Customer Application
├── vendor/                  # React Vendor Application
├── src/                     # Spring Boot Backend Source Code
├── uploads/                 # Product Images
├── Screenshots E-commerce/  # Project Screenshots
├── pom.xml
└── README.md
```

---

# 🔒 Security

- ✅ Spring Security
- ✅ JWT Authentication
- ✅ BCrypt Password Encryption
- ✅ Role-Based Authorization
- ✅ Protected REST APIs
- ✅ CORS Configuration

---

# 📦 Database Tables

- User
- Customer
- Vendor
- Category
- SubCategory
- Product

---

# 🚀 REST APIs

### Authentication

```http
POST /register
POST /login
```

### Categories

```http
GET    /get/categories
POST   /vendor/categories
```

### Sub Categories

```http
POST   /vendor/subcategories
```

### Products

```http
GET    /get/products
GET    /get/products/{id}
POST   /vendor/products
PUT    /vendor/products/{id}
DELETE /vendor/products/{id}
```

---

# 🎯 Key Concepts

- Object-Oriented Programming
- MVC Architecture
- REST APIs
- Spring Security
- JWT Authentication
- Dependency Injection
- Repository Pattern
- DTO Pattern
- Exception Handling
- Validation
- React Hooks
- API Integration

---

# 💻 Getting Started

## Clone Repository

```bash
git clone https://github.com/jayeshshinde700/Easy-Mart---Full-Stack-E-Commerce-Website.git
```

---

## Backend

```bash
mvn clean install
mvn spring-boot:run
```

---

## Customer Frontend

```bash
cd customer
npm install
npm start
```

---

## Vendor Frontend

```bash
cd vendor
npm install
npm start
```

---

## Database

Create the database

```sql
CREATE DATABASE easy_mart;
```

Update the MySQL configuration inside

```text
application.properties
```

---

# 📸 Project Screenshots

## 🏠 Home Page

![Home](Screenshots%20E-commerce/home.png)

---

## 🔑 Login Page

![Login](Screenshots%20E-commerce/login.png)

---

## 🛍 Product Listing

![Products](Screenshots%20E-commerce/products.png)

---

## ➕ Add Category

![Add Category](Screenshots%20E-commerce/add-category.png)

---

## 📂 Add Sub Category

![Add Sub Category](Screenshots%20E-commerce/add-sub_category.png)

---

## ➕ Add Product

![Add Product](Screenshots%20E-commerce/add-product.png)

---

## ✏️ Update Product

![Update Product](Screenshots%20E-commerce/vendor-update_product.png)

---

## 🏪 Vendor Dashboard

![Vendor Dashboard](Screenshots%20E-commerce/vendor-dashboard.png)

---

# 🚀 Future Improvements

- 💳 Payment Gateway Integration
- ❤️ Wishlist
- ⭐ Product Reviews & Ratings
- 📦 Shopping Cart & Checkout
- 📧 Email Notifications
- 📊 Admin Dashboard
- 🔍 Advanced Search & Filters
- 📄 Pagination
- 🌐 Google Authentication
- 🔐 Forgot Password

---

# 📚 Learning Outcomes

- Full Stack Application Development
- Spring Boot REST API Development
- React.js Frontend Development
- JWT Authentication
- Spring Security
- MySQL Database Design
- Role-Based Authorization
- REST API Integration
- CRUD Operations
- File Upload Handling

---

# 👨‍💻 Author

## Jayesh Shinde

**Aspiring Full Stack Java Developer**

### Skills

- Java
- Spring Boot
- React.js
- MySQL
- REST APIs
- JWT Authentication
- Git & GitHub

### Connect with Me

- 💼 LinkedIn: https://www.linkedin.com/in/jayeshshinde700
- 📧 Email: jayeshshinde700@gmail.com

---

## ⭐ If you like this project

Please consider giving this repository a ⭐ on GitHub!
