# Movie REST API (Spring Boot)

## What is this project?
This is a simple Java Spring Boot backend application.  
It provides REST APIs to manage movies.  
Data is stored in memory using an ArrayList (no database).

## Tools Used
- Java
- Spring Boot
- Spring Web
- Maven
- Postman

## How to run this project
1. Open the project folder  
2. Open terminal / command prompt  
3. Run:
   ```bash
   mvn spring-boot:run
Application runs on:

http://localhost:8080
How to test (Postman)
Add Movie
POST http://localhost:8080/api/movies

{
  "name": "Inception",
  "description": "Sci-fi movie",
  "rating": 8.8
}
Get Movie by ID
GET http://localhost:8080/api/movies/1

Notes
No database used

In-memory storage (ArrayList)

Input validation enabled

Author
Ashutosha Samal
