What is an MVC? #

- Model – The model stores the data that is being transferred between the Controller component and View. It does not have any business logic and is only responsible for holding data.
- View – It is the presentation layer, which represents the data collected from the Model in a simplified way. A user interacts with the application using a View.
- Controller – The Controller is placed between the View and the Model. It handles the user request via the View, processes it and interacts with the Model, and sends the response back to the View.

What are microservices? #

In the microservices architecture, a complex task is distributed into multiple tasks or services, and each task is developed and managed independently to support business applications.

Multiple services are helpful with:
- Removing dependencies when multiple people are working on separate repository and code bases.
- Ease of development and maintenance
- Easy deployment and scalability
- Significantly shorter time for production release
- Avoiding single points of failure
Microservice architecture is is popular for many reasons; it allows developers to develop and deploy services independently easily with minimum configurations.

What is Spring Boot? #

Spring Boot is an open-source Java-based framework used to create microservices and production-ready standalone Spring MVC applications. 
It is a project built on top of the Spring framework (a Java application development framework that acts as an Inversion of Control, or an IoC, container) that provides an efficient way to set up and run applications.

The best part of using Spring Boot is the ramp-up time; you can start with minimum configurations and an auto configurable capability, which saves a lot of development time and increases productivity.

Advantages of Spring Boot #

The main advantages of using the Spring Boot framework are:

- Most of the plugins or dependencies that we add can be auto-configured using application.properties / application.yml.
- It can easily configure Java Beans, Database configurations, etc. using Annotations.
- It comes with an embedded servlet container to run your application.
- It provides very easy dependency management, so developers can just code without worrying or wasting time on it.
- It gives support for most of the open-source tools like Kafka, Redis, RabbitMQ, SQL, and No-SQL databases, using Spring Data, for developing reactive applications, etc.

What is Bean? #

Bean is an instance of a Java object managed by a Spring IoC (Inversion of Control) container.

Inversion of Control is the process of being provided with objects along with their required dependencies without us creating them. 
The design pattern used for implementing an IoC is Dependency Injection, using which we can create and bind dependent objects.

Annotations #

@Scope #

Scope of an object defines the region within which the object is accessible. All beans in Spring are by default SINGLETON. 
We can override the scope of the bean using @Scope("singleton").

- singleton: A single instance of the object created per Spring IoC
- prototype: new instance of the object created every time a request is made to the bean
- request: A new instance of the object is created for every single HTTP request, and the same will be used throughout the lifecycle of the HTTP request
- session: A new instance of the object is created and used throughout the lifecycle of every HTTP session
- global session: A new instance of the object is created and used throughout the lifecycle of the global HTTP session

@SpringBootApplication #

@EnableAutoConfiguration – for auto-configuring the application depending on the dependencies that are added.
Example – We have added the in-memory H2 database. The necessary data source creation at the time of application bootup using the configurations provided in src/main/resources/application.properties or command-line arguments, if any, etc.

@SpringBootConfiguration – indicates that the class contains Spring Boot configurations. 
It can be used as an alternative to @Configuration.

@ComponentScan – to make Spring Boot aware of the packages that it needs to scan to find all the Spring Boot configuration-annotated classes. 
By default, the package name is the same as the package name of the class in which the annotation is present.

@Qualifier #
A bean can be referenced using class or by name. We can have multiple beans of the same type, and during dependency injection using @Autowired, Spring IoC will not be able to distinguish between the beans.

@Component #

@Component annotated class is registered as Spring bean. This is a generic annotation, and there are few specialized annotations for different purposes, like the following:

@Service – for indicating that the annotated class acts as a “Business Service Facade”.

@Repository – for indicating that the class acts as a Database Access Object (DAO) for accessing and manipulating the persisted data.

@Controller – for indicating that the annotated class is a web controller containing request handling methods.

@RestController – this is a convenience controller that infers the response body from the return type of the request handling method, instead of handling explicitly for every single method.

@Configuration – for indicating that the annotated class is for configuration or for holding configuration methods, like @Bean annotated methods.

Maintaining profiles #

Spring Boot allows us to maintain configuration files of different profiles in the format application-<profile>.properties, and these properties’ files need to be present in src/main/resources.

Example: application-dev.properties or application-staging.properties or application-prod.properties.

To activate a profile, we can set the property spring.profiles.active = dev in application.properties, 
where dev can be replaced with the desired profile name, as shown below:

src/main/resources/application.properties

spring.profiles.active = dev
The property that is accessed will be looked up in the current activate profile. If not found, it falls back to the one present in the default application.properties. If neither property is found and the configuration parameter is marked mandatory, Spring will throw an exception saying the expected property is missing.

Externalizing configurations #
@Value helps us inject the properties to fields and parameters

Running the application #

For Linux/Macintosh

cd <extracted-folder>
./gradlew clean build bootRun

For Windows

cd <extracted-folder>
gradlew clean build bootRun











