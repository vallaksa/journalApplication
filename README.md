# Journal Application  

## Overview  
This is a journal application developed using **Spring Boot** and **Java**, with **MongoDB Atlas** as the database. The application provides functionality for users to create, view, and manage their journal entries, while maintaining secure role-based access.  

---  

## Features  
- **User Authentication and Authorization**:  
  - Role-based access control using `USER` and `ADMIN` roles.  
  - `USER`: Can only view and manage their own journal entries.  
  - `ADMIN`: Can view all users' journal entries.  
- **Journal Management**:  
  - Create, update, view, and delete journal entries.  
  - Each entry is securely linked to the respective user.  
- **Cloud Database**:  
  - Utilizes **MongoDB Atlas** for secure and scalable database storage.  
- **Scalable Architecture**:  
  - Built with Spring Boot for a robust and maintainable backend.  

---  

## Tech Stack  
- **Backend**: Spring Boot (Java)  
- **Database**: MongoDB Atlas (NoSQL)  
- **Authentication**: Spring Security  
- **Build Tool**: Maven  
- **ORM**: Spring Data MongoDB  

---  

## Installation  

### Prerequisites  
- Java 17 or higher  
- Maven  
- MongoDB Atlas account  
- Git  

### Steps to Setup  

1. **Clone the repository**:  
   ```bash  
   git clone <repository-url>  
   cd journal-application  
