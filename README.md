# SpringToDoWebApp

**Description:**
The SpringToDoWebApp is a robust and user-friendly web application built using the Spring Boot framework, designed to help users manage their tasks efficiently. Leveraging various components of the Spring ecosystem, this project ensures a seamless experience with features such as task creation, editing, and deletion, all wrapped in an intuitive and aesthetically pleasing user interface.

**Key Components and Features:**

1. **Controller:**
The application uses Spring MVC architecture with controllers to handle HTTP requests and manage the flow of data between the model and the view. The controllers ensure smooth interaction between the user interface and the backend functionality.
2. **HTML with JSP:**
The frontend is crafted using HTML and JSP (JavaServer Pages), providing dynamic and interactive content to users. JSP allows for embedding Java code directly into the HTML pages, facilitating the integration of dynamic data seamlessly.
3. **CSS with Bootstrap:**
Bootstrap is employed for styling and layout, ensuring a responsive and visually appealing design. The use of CSS enhances the overall user experience, providing a modern and consistent look across different devices and screen sizes.
4. **Validations:**
The application incorporates robust input validations to ensure data integrity and prevent erroneous or malicious inputs. Server-side validation is implemented using Spring's validation framework, providing a secure and reliable application.
5. **Login Page:**
To enhance user security and personalize the experience, the project includes a login page. Users are required to authenticate themselves before accessing the to-do functionalities, ensuring data privacy and access control.
6. **Spring Security:**
Spring Security is integrated to manage authentication and authorization processes. It safeguards the application against unauthorized access, provides role-based access control, and ensures secure user authentication.
7. **Database Support with Spring JPA:**
The application employs Spring Data JPA to interact with a relational database, enabling seamless storage and retrieval of task data. JPA simplifies database operations, reducing boilerplate code and enhancing the overall efficiency of the application.

Note: This application is not designed for real production integration. It's only for educational purposes.

**How to Run the Project:**

1. Clone the repository from [https://github.com/Thevic16/spring-boot-web-application].
2. Configure the database connection in the application.properties file.
3. Build and run the application using Maven or your preferred build tool.
4. Access the application through the provided URL and explore the feature-rich to-do management system.
    
    ```docker
    #url
    http://localhost:8080/login
    ```
    
    ```docker
    #Credentials
    username= ranga
    password= dummydummy
    ```
    

**Login page.**

![Untitled](SpringToDoWebApp%203721a7638f8f409cb7093408832df666/Untitled.png)

**Simple Welcome Page.**

![Untitled](SpringToDoWebApp%203721a7638f8f409cb7093408832df666/Untitled%201.png)

**List-todos Page.**

![Untitled](SpringToDoWebApp%203721a7638f8f409cb7093408832df666/Untitled%202.png)

**Add-todo Page.**

![Untitled](SpringToDoWebApp%203721a7638f8f409cb7093408832df666/Untitled%203.png)

**Update-todo Page.**

![Untitled](SpringToDoWebApp%203721a7638f8f409cb7093408832df666/Untitled%204.png)

**Conclusion:**
The SpringToDoWebApp not only showcases the power and flexibility of the Spring Boot framework but also provides a practical example of building a secure and feature-rich web application. Whether you are a developer looking to understand Spring-based web development or a user in need of a reliable to-do application, this project serves as an excellent reference point.

### Docker

Launch MySQL using Docker

```docker
docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=todos-user --env MYSQL_PASSWORD=dummytodos --env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 mysql:8-oracle
```