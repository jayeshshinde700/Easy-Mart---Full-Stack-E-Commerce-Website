# 🛒 Easy-Mart
### A Full Stack E-Commerce Web Application

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk">
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot">
  <img src="https://img.shields.io/badge/React-19-61DAFB?style=for-the-badge&logo=react">
  <img src="https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql">
  <img src="https://img.shields.io/badge/JWT-Authentication-black?style=for-the-badge">
</p>

<p align="center">
A secure and scalable Full Stack E-Commerce application built with Spring Boot, React, MySQL, and JWT Authentication.
</p>

---

# 📖 Overview

Easy-Mart is a modern e-commerce platform that allows customers to browse products, manage their shopping cart, and place orders while vendors can manage categories, products, inventory, and product images through secure role-based authentication.

The application follows a clean layered architecture and demonstrates modern full-stack development practices using Java Spring Boot and React.

---

# ✨ Features

## 🔐 Authentication

- User Registration
- Secure Login
- JWT Authentication
- BCrypt Password Encryption
- Role-Based Authorization
- Protected REST APIs

---

## 👤 Customer Module

- Register & Login
- Browse Products
- View Product Details
- Search Products
- Filter Products
- Add to Cart
- Update Cart
- Remove Items
- Place Orders
- View Order History

---

## 🏪 Vendor Module

- Vendor Login
- Manage Categories
- Manage Subcategories
- Add Products
- Update Products
- Delete Products
- Upload Product Images
- Manage Inventory

---

# 🛠 Tech Stack

| Frontend | Backend | Database | Tools |
|----------|----------|----------|-------|
| React.js | Java 17 | MySQL | Git |
| Bootstrap 5 | Spring Boot | Hibernate | GitHub |
| React Router | Spring Security | JPA | Postman |
| Axios | JWT | | IntelliJ IDEA |
| React Hook Form | Maven | | VS Code |

---

# 🏗 Architecture

```
React Frontend
       │
       ▼
REST APIs
       │
       ▼
Spring Boot Backend
       │
       ▼
Spring Security + JWT
       │
       ▼
MySQL Database
```

---

# 📂 Project Structure

```
Easy-Mart
│
├── Backend
│   ├── controllers
│   ├── services
│   ├── repositories
│   ├── entities
│   ├── dto
│   ├── configurations
│   ├── jwt
│   └── enums
│
└── Frontend
    ├── components
    ├── pages
    ├── services
    ├── routes
    ├── assets
    └── utils
```

---

# 🔒 Security

✔ Spring Security

✔ JWT Authentication

✔ BCrypt Password Encryption

✔ Role-Based Access Control

✔ Protected REST APIs

✔ CORS Configuration

---

# 📦 Database Tables

- User
- Customer
- Vendor
- Category
- SubCategory
- Product
- Cart
- Orders

---

# 🚀 REST APIs

### Authentication

```
POST /register
POST /login
```

### Categories

```
GET    /get/categories
POST   /vendor/categories
PUT    /vendor/categories/{id}
DELETE /vendor/categories/{id}
```

### Products

```
GET    /get/products
GET    /get/products/{id}
POST   /vendor/products
PUT    /vendor/products/{id}
DELETE /vendor/products/{id}
```

### Cart

```
GET    /customer/cart
POST   /customer/cart
PUT    /customer/cart
DELETE /customer/cart/{id}
```

### Orders

```
POST /customer/orders
GET  /customer/orders
```

---

# 🎯 Key Concepts

- Object-Oriented Programming
- RESTful APIs
- MVC Architecture
- Dependency Injection
- Spring Security
- JWT Authentication
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
git clone https://github.com/yourusername/easy-mart.git
```

---

## Backend

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

---

## Frontend

```bash
cd frontend
npm install
npm start
```

---

## Database

Create a MySQL database

```sql
CREATE DATABASE easy_mart;
```

Update your database configuration inside

```
application.properties
```

---

# 📸 Screenshots

| Home | Products |
|------|----------|
| Add Screenshot | Add Screenshot |

| Cart | Vendor Dashboard |
|------|------------------|
| Add Screenshot | Add Screenshot |

---

# 🚀 Future Improvements

- 💳 Payment Gateway Integration
- ❤️ Wishlist
- ⭐ Product Reviews & Ratings
- 📦 Order Tracking
- 📧 Email Notifications
- 📊 Admin Dashboard
- 🔍 Advanced Search
- 📄 Pagination
- 🌐 Google Login
- 🔐 Forgot Password & OTP

---

# 📚 What I Learned

- Building a Full Stack Application
- Secure Authentication with JWT
- Spring Security
- REST API Development
- React Routing
- API Integration
- Database Design
- File Upload Handling
- Role-Based Authorization

---

# 👨‍💻 Author

## Jayesh Shinde

**Aspiring Full Stack Java Developer**

**Skills**

- Java
- Spring Boot
- React.js
- MySQL
- REST APIs
- JWT Authentication
- Git & GitHub

---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub!
