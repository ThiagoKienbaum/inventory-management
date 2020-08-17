![GitHub](https://img.shields.io/github/license/ThiagoKienbaum/inventory-management-backend)
![GitHub last commit](https://img.shields.io/github/last-commit/ThiagoKienbaum/inventory-management-backend)
![GitHub language count](https://img.shields.io/github/languages/count/ThiagoKienbaum/inventory-management-backend)
![GitHub top language](https://img.shields.io/github/languages/top/ThiagoKienbaum/inventory-management-backend)


![GitHub followers](https://img.shields.io/github/followers/ThiagoKienbaum?label=Follow&style=social)
![GitHub stars](https://img.shields.io/github/stars/ThiagoKienbaum/inventory-management-backend?style=social)
![GitHub watchers](https://img.shields.io/github/watchers/ThiagoKienbaum/inventory-management-backend?style=social)
![GitHub forks](https://img.shields.io/github/forks/ThiagoKienbaum/inventory-management-backend?style=social)


# Inventory Management Backend

This project is a backend API REST to manage inventory. 

Feel free to use it to practice/develop your frontend.

## Built with
* Java
    - Spring Framework
    - JPA
    - Maven
* Database
    - PostgreSQL
* ORM
    - Hibernate
* Design pattern
    - MVC    
* Others
    - Docker
    - API REST
    
## Development setup

```
git clone https://github.com/ThiagoKienbaum/inventory-management-backend.git 

cd inventory-management-backend

```

### On docker, run:
```
docker run --name <database-name> -e POSTGRES_PASSWORD=<password> -p 5432:5432 -d postgres

```

### Run the Application class

Now you can access the API on your localhost:8080

## Usage guide

* Create a product
  - Post/inventory
  - Body
 ```  
 {
    "name": <String>,
    "category": <String>,
    "cost": <double>,
    "quantity": <int>
  }
  ```


* Return all inventory products
  - Get/inventory


* Filter products by category
  - Get/inventory/{category}


* Update a product
  - Put/inventory
  - Body
 ```
 {
    "id": <int>,
    "name": <String>,
    "category": <String>,
    "cost": <double>,
    "quantity": <int>
 }
 ```


* Delete a product
  - Delete/inventory/{id}


* Add a quantity of a product to inventory
  - Put/add/{id}
  - Body
 ```
 {
    <int>
 }
 ```


* Sell a product
  - Put/sales/{id}
  - Body
 ```
 {
    "pricePerProduct": <double>,
    "soldQuantity": <int>
 }
 ```


## Meta

Thiago Kienbaum – [LinkedIn](https://www.linkedin.com/in/thiago-kienbaum/) – thiago.kienbaum@hotmail.com
