# interview case study
Simple ecommerce application built with front end (AngularJS) and back-end (Spring Boot)

## Getting started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Technology Stack
Component         | Technology
---               | ---
Frontend          | [Angular 4](https://github.com/angular/angular)
Backend (REST)    | [SpringBoot](https://projects.spring.io/spring-boot) (Java)
REST Spec         | [Open API Standard](https://www.openapis.org/) 
In Memory DB      | H2 
Persistence       | JPA (Using Spring Data)
Client Build Tools| [angular-cli](https://github.com/angular/angular-cli), Visual Studio Code, npm
Server Build Tools| Maven(Java) 

## Folder Structure
```bash
PROJECT_FOLDER
│ README.md
| pom.xml 
| LICENSE 
└──wine-bottles
└──interview-case-study
                      └──  │  pom.xml           
                           │  build.gradle
                           └──[src]      
                           │  └──[main]      
                           │     └──[java]      
                           │     └──[resources]
                           │        │  application.properties #contains springboot cofigurations
                           │     └──[frontend]
                           │           │  package.json     
                           │           │  angular-cli.json   #ng build configurations)
                           │           └──[node_modules]
                           │           └──[src]              #frontend source files
                           │           └──[dist]             #frontend build files, auto-created after running angular build: ng -build
                           │     
                           │
                           └──[target]              #Java build files, auto-created after running java build: mvn install
                           │  └──[classes]
                           │     └──[public]
                           │     └──[frontend]         #frontend folder is created by (maven/gradle) which copies frontend/dist folder 
                           │                        #the application.properties file list frontend as a resource folder 

```
## Prerequisites
Ensure you have this installed before proceeding further
- Java 8
- Maven 3.3.9+ 
- Node 6.0 or above,  
- npm 5 or above,   
- Angular-cli 1.6.3

## About
This is a simple ecommerce application with a RESTfull implementation of an ecommerce service.
The goal of the project is to 
- Highlight techniques of makinga REST full app using [SpringBoot](https://projects.spring.io/spring-boot)
- How to consume a RESTfull service and make a HTML5 based Single Page App using [Angular 4+](https://github.com/angular/angular)

### Features of the Project
* Backend
  * In Memory DB with H2 
  * Using JPA and JDBC template to talk to relational database
  * How to request and respond for data 

* Frontend
  * Organizing Components, Services, Directives, Pages etc in an Angular App
  * Basic visulaization

* Build
  * How to build all in one app that includes (database, sample data, RESTfull API and frontend)
  * Portable app, Ideal for dockers, cloud hosting.

## In Memory DB (H2)
I have included an in-memory database for the application. Database schema and sample data for the app is created everytime the app starts, and gets destroyed after the app stops, so the changes made to to the database are persistent only as long as the app is running
<br/>
Creation of database schema and data are done by JPA using backed app models that Springs runs automatically. 
To modify the database schema or the data you can modify the backend app models which can be found at `/src/main/java/com/backend/ecommerce/model/`

### Build Frontend (optional step)
Code for frontend is allready compiled and saved under the ```interview-case-study/src/main/frontend/dist``` 
when building the backend app (using maven) it will pickup the code from ```interview-case-study/src/main/frontend/dist```. However if you modified the frontend code and want your changes to get reflected then you must build the frontend 
```bash
# Navigate to PROJECT_FOLDER/interview-case-study/src/main/frontend (should contain package.json )
npm install
# build the project (this will put the files under dist folder)
ng build --prod --aot=true
```

### Build Backend (SpringBoot Java)
```bash
# Maven Build : Navigate to PROJECT_FOLDER/interview-case-study pom.xml is present 
mvn clean install
```

### Start the backend API and frontend server
```bash
# Before Starting the backend API, ensure port 8080 is not being used
# Navigate to PROJECT_FOLDER/interview-case-study
mvn spring-boot:run
# port and other configurations for API servere is in [./src/main/resources/application.properties](/src/main/resources/application.properties) file

# Before starting the frontend server, ensure port 4200 is not being used.
# Navigate to PROJECT_FOLDER/interview-case-study/src/main/frontend
npm start
```

### Accessing Application
Cpmponent         | URL                                      | Credentials
---               | ---                                      | ---
Frontend          |  http://localhost:4200                   | 
H2 Database       |  http://localhost:8080/h2-console        |  Driver:`org.h2.Driver` <br/> JDBC URL:`jdbc:h2:mem:ecommercedb` <br/> User Name:`sa`
API (backend)     |  http://localhost:8080/api               | 

**Testing the backend application** 
The below request will fetch existing products automatically inserted when the backend application was started

```bash
curl -X GET --header 'Accept: application/json'  'http://localhost:8080/api/products'
```

## Licensing
This project is licensed under Apache license. 



 
