# RestAPI com SpringBoot, Hibernate e JPA.

<h2>Requisitos</h2>

1- Java 17+<br>
2- Maven 3.x+

<h2>Passo a passo</h2>

<h3>1. Clonar aplicativo</h3>

<code>git clone https://github.com/elwgomes/springboot-webservices.git</code>

<h3>2. Execute o aplicativo</h3>
Vá para a pasta raiz, abra no terminal e, em seguida, <code>mvn spring-boot:run</code>

O aplicativo será executado em http://localhost:5500

<h2>3. Divirta-se com as APIs</h2>

```
GET - localhost:5500/usuários | também pode tentar /products, /orders e /categories
GET - localhost:5500/users/{id} | também pode tentar /products, /orders e /categories
POST - localhost:5500/usuários
PUT - localhost:5500/users/{id}
EXCLUIR - localhost:5500/users/{id}
```

Para PUT, POST e DELETE, use Postman ou vá para /config/TestConfig.java na pasta de origem e crie uma instância manualmente.
