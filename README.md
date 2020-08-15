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

A live version of the frontend web can be seen [here](https://).

A live version of API can be accessed [here](http://).


## Built with
* Java 
* Database
    - PostgreSQL
    - MongoDB
* ORM
    - Sequelize
    - Mongoose
* Design pattern
    - MVC    
* Others
    - Sentry
    - Docker
    - API REST
    
## Development setup

```
git clone https://github.com/ThiagoKienbaum/inventory-management-backend.git 

cd inventory-management-backend

yarn
```
Create a .env file on root of project and setup the environment variables like .env.example file.

### On docker, run:
```
docker run --name <database-name> -e POSTGRES_PASSWORD=<password> -p 5432:5432 -d postgres

docker run --name <database-name> -p 27017:27017 -d -t mongo

```

### Run the project
```
yarn dev 
```

Now you can access the API on your localhost:3333

## Usage guide

* Create a user
  - Post/users
  - Body
 ```  
 {
  "name": "",
	"github_id": "",
	"email": "",
	"password": "",
	"confirmPassword": ""
  }
  ```
  
* Login
  - Post/sessions
  - Body
 ```  
 {
  "email": "",
	"password": "",	
  }
  ```
  
### After this point, you need to send a valid Bearer Token on Authoziration.
* Update a user 
  - Post/users
  - Body (send information you want to update)
 ```  
 {
  "name": "",
	"github_id": "",
	"email": "",
	"password": ""
  }
```

* Return all repositories
  - Get/repositories

* Create a tag
  - Post/tags/:RepositoryID
  - Body 
 ```  
{
  "newTag": ""
}
  ```  
  
* Filter per tag
  - Post/tags/:tag
    
* Update a tag
  - Post/tags/:RepositoryID/:tag
  - Body 
 ```  
{
  "updatedTag": ""
}
  ```  
  
* Delete a tag
  - Post/tags/:RepositoryID/:tag
  - Body   
  
  
  
## Meta

Thiago Kienbaum – [LinkedIn](https://www.linkedin.com/in/thiago-kienbaum/) – thiago.kienbaum@hotmail.com
