# Workshop Springboot3 JPA

## Description

This repository is a copy (with some changes) of the repository [workshop-springboot3-jpa](https://github.com/acenelio/workshop-springboot3-jpa) by [acenelio](https://github.com/acenelio) made in his course Java COMPLETO 2023 Programação Orientada a Objetos +Projetos.

![domain-model-diagram](src/main/resources/static/docs/domain-model-diagram.png)

![domain-instance-diagram](src/main/resources/static/docs/domain-instance-diagram.png)

## Prerequisites

- Java 8 or higher
- PostgreSQL

## Configuration

1. In `src/main/resources/application.properties`, the default profile is `test` which will use the in-memory H2 database. To view the database, run the API, and type the URL in your browser: `localhost:8080/h2-console`.

    ```bash
    spring.profiles.active=test
    ```
   
2. If you want to use PostgreSQL, switch the profile to `dev` and make the following settings:

    ```bash
    spring.profiles.active=dev
    ```

3. open `application-dev.properties`; 

4. Create a database with the name of your preference in postgresql, and insert its URL:

    ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_course
    ```

5. Enter your username:

    ```bash
    spring.datasource.username=postgres
    ```

6. Enter your password:

    ```bash
    spring.datasource.password=1234567
    ```

## API Endpoints

### Users

- `GET users`: returns a list of all users.

  ![get-all-users](src/main/resources/static/docs/get-all-users.png)

- `GET users/{id}`: returns a user by id.

  ![get-user-by-id](src/main/resources/static/docs/get-user-by-id.png)

- `POST users`: Registers a user.

  ![post-user](src/main/resources/static/docs/post-user.png)

- `DELETE users/{id}`: Deletes a user by id.

  ![delete-user](src/main/resources/static/docs/delete-user.png)

- `PUT users/{id}`: Updates the data of a user by id.

  ![put-user](src/main/resources/static/docs/put-user.png)

### Categories

- `GET categories`: returns a list of all categories.

  ![get-all-categories](src/main/resources/static/docs/get-all-categories.png)

- `GET categories/{id}`: returns a category by id.

  ![get-category-by-id](src/main/resources/static/docs/get-category-by-id.png)

- `POST categories`: Registers a category.

  ![post-category](src/main/resources/static/docs/post-category.png)

- `DELETE categories/{id}`: Deletes a category by id.

  ![delete-category](src/main/resources/static/docs/delete-category.png)

- `PUT categories/{id}`: Updates the data of a category by id.

  ![put-category](src/main/resources/static/docs/put-category.png)

### Products

- `GET products`: returns a list of all products.

  ![get-all-products](src/main/resources/static/docs/get-all-products.png)

- `GET products/{id}`: returns a product by id.

  ![get-product-by-id](src/main/resources/static/docs/get-product-by-id.png)

### Orders

- `GET orders`: returns a list of all orders.

  ![get-all-orders](src/main/resources/static/docs/get-all-orders.png)

- `GET orders/{id}`: returns an order by id.

  ![get-order-by-id](src/main/resources/static/docs/get-order-by-id.png)
