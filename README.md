What is an MVC? #

MVC, or Model-View-Controller, , is an architecture pattern that helps you to organize your code into three logical components: View, Model, and Controller.
Many softwares are developed using this design pattern.

- Model – The model stores the data that is being transferred between the Controller component and View. It does not have any business logic and is only responsible for holding data.

- View – It is the presentation layer, which represents the data collected from the Model in a simplified way. A user interacts with the application using a View.

- Controller – The Controller is placed between the View and the Model. It handles the user request via the View, processes it and interacts with the Model, and sends the response back to the View.

What are microservices? #
In the microservices architecture, a complex task is distributed into multiple tasks or services, and each task is developed and managed independently to support business applications.

Example - Let’s consider that we have a feature to developed on an e-commerce website for the checkout process; we can perform all these actions during the checkout process:

- Add items to the cart
- Add address and Zipcode
- Make a payment
- Review order status
Now, if we just have a single service doing all these, it is called a Monolithic architecture, and when multiple services perform these tasks (like one service for add to cart, one for select address, one for payment, etc), it is considered a Microservices architecture. Multiple services are helpful with:

- Removing dependencies when multiple people are working on separate repository and code bases.
- Ease of development and maintenance
- Easy deployment and scalability
- Significantly shorter time for production release
- Avoiding single points of failure

Microservice architecture is is popular for many reasons; it allows developers to develop and deploy services independently easily with minimum configurations.

What is Spring Boot? #
Spring Boot is an open-source Java-based framework used to create microservices and production-ready standalone Spring MVC applications. It is a project built on top of the Spring framework (a Java application development framework that acts as an Inversion of Control, or an IoC, container) that provides an efficient way to set up and run applications.

The best part of using Spring Boot is the ramp-up time; you can start with minimum configurations and an auto configurable capability, which saves a lot of development time and increases productivity.

Advantages of Spring Boot #

The main advantages of using the Spring Boot framework are:

- Most of the plugins or dependencies that we add can be auto-configured using application.properties / application.yml.
- It can easily configure Java Beans, Database configurations, etc. using Annotations.
- It comes with an embedded servlet container to run your application.
- It provides very easy dependency management, so developers can just code without worrying or wasting time on it.
- It gives support for most of the open-source tools like Kafka, Redis, RabbitMQ, SQL, and No-SQL databases, using Spring Data, for developing reactive applications, etc.























