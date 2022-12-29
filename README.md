# RestAPI w/ SpringBoot, Hibernate and JPA.

<h2>Requirements</h2>

1- Java 17+<br>
2- Maven 3.x+

<h2>Step by step</h2>

<h3>1. Clone application</h3>

<code>git clone https://github.com/elwgomes/springboot-webservices.git</code>

<h3>2. Check properties at source folder</h3>
Go to application-test.properties to change h2 user, passwd and url if u want.<br>
By default application.properties is in "test" profile, u can change if u want.<br>
Change server port in application.properties too (i prefer to use :5500).

<h3>Run the application</h3>
Go to the root folder, open in terminal and then <code>mvn spring-boot:run</code>

App will run in http://localhost:5500

<h2>Have fun with API's</h2>

```
GET - localhost:5500/users             | also can try /products, /orders and /categories
GET - localhost:5500/users/{id}        | also can try /products, /orders and /categories
POST - localhost:5500/users
PUT - localhost:5500/users/{id}
DELETE - localhost:5500/users/{id}
```

For PUT, POST and DELETE use Postman or go to /config/TestConfig.java in source folder and instantiate manually.

  
