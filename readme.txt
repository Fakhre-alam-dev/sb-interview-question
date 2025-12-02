Spring Boot Interview Questions
1. @Component
2. @Autowired
3. @Qualifier
   is used along with @Autowired to resolve the ambiguity when multiple beans of the same type are present in the Spring context.
   It allows you to specify which bean should be injected by providing a unique identifier.
4. @Primary
   is used to indicate that a specific bean should be given preference when multiple beans of the same type are available
   for autowiring. It helps to avoid ambiguity by designating one bean as the primary candidate for injection.
5. @Bean
    is used to define a bean explicitly within a @Configuration class. It allows you to create. and configure beans programmatically,
    providing more control over their instantiation and initialization.
6. @Configuration
   is used to indicate that a class contains bean definitions and configuration settings for the Spring application context.
   It is typically used to create Java-based configuration instead of XML-based configuration.
7. Stereotype
   is a meta-annotation that serves as a specialization of @Component. It is used to define specific types of components,
   such as @Component,  @Service, @Repository, and @Controller, providing better clarity and organization in the codebase.
8. @Scope
   is used to define the scope of a bean in the Spring context. It allows you to specify whether a bean should be singleton,
   prototype, request-scoped, session-scoped, or application-scoped, determining its lifecycle and visibility.
9. @Value
   is used to inject values into fields, method parameters, or constructor parameters from external sources,
   such as properties files, environment variables, or system properties.
10. @PropertySource
    is used to specify the location of a properties file to be loaded into the Spring environment.
    It allows you to externalize configuration settings and make them accessible within the application.
11. @PropertySources
    is used to aggregate multiple @PropertySource annotations on a single class.
    It allows you to load multiple properties files into the Spring environment, providing a convenient way to manage configuration settings from different sources.
12. @Lazy
    is used to indicate that a bean should be lazily initialized, meaning it will only be created when it is first requested,
    rather than at application startup. This can help improve startup time and resource usage.
    @Lazy can be applied at the class level or on individual bean definitions.
13. @ConfigurationProperties
    is used to directly bind external configuration properties (e.g., from properties files or YAML files) to a Java class.
    It allows you to map configuration values to fields in a type-safe manner, making it easier to manage and access configuration settings within the application.
14. @Controller
    is a specialization of @Component used to define a controller in a Spring MVC application.
    It is responsible for handling HTTP requests, processing user input, and returning appropriate responses.
15. @RequestMapping
    is used to map HTTP requests to specific handler methods and in a controller class.define base URI for all methods within the class.
    It allows you to define the URL patterns, HTTP methods, and other attributes for handling incoming requests.
    define multiple mappings for a single method.
    can define produces and consumes attributes to specify the media types that the method can handle.
16. @RestController
    is a specialization of @Controller that combines @Controller and @ResponseBody.
    It is used to create RESTful web services, where the response is typically in JSON or XML format.
17. @ResponseBody
    is used to indicate that the return value of a method should be serialized directly into the HTTP
    response body, rather than being interpreted as a view name.
    It is commonly used in RESTful web services to return data in formats like JSON or XML.
18. @Service
    is a specialization of @Component used to define a service layer component in a Spring application.
    It typically contains business logic and interacts with repositories or other services to perform operations.
19. @Repository
    is a specialization of @Component used to define a data access layer component in a Spring application.
    It is responsible for interacting with the database or other data sources to perform CRUD operations.
20. @EnableAutoConfiguration
    is used to enable Spring Boot's auto-configuration feature, which automatically configures the application
    based on the dependencies present in the classpath. It helps to reduce boilerplate configuration and
    simplifies the setup of Spring Boot applications.
21. @SpringBootApplication
    is a convenience annotation that combines @Configuration, @EnableAutoConfiguration,
    and @ComponentScan. It is used to mark the main class of a Spring
    Boot application and serves as the entry point for the application.
22. @ComponentScan
    is used to specify the base packages to scan for Spring components, such as @Component, @Service,
    @Repository, and @Controller. It allows you to define the scope of component scanning and
    ensures that the necessary beans are detected and registered in the Spring context.
23. @GetMapping
    is a specialized version of @RequestMapping that is used to handle HTTP GET requests.
    It simplifies the mapping of GET requests to specific handler methods in a controller.
24. @PostMapping
    is a specialized version of @RequestMapping that is used to handle HTTP POST requests.
    It simplifies the mapping of POST requests to specific handler methods in a controller.
25. @PutMapping
    is a specialized version of @RequestMapping that is used to handle HTTP PUT requests.
    It simplifies the mapping of PUT requests to specific handler methods in a controller.
26. @DeleteMapping
    is a specialized version of @RequestMapping that is used to handle HTTP DELETE requests.
    It simplifies the mapping of DELETE requests to specific handler methods in a controller.
27. @PatchMapping
    is a specialized version of @RequestMapping that is used to handle HTTP PATCH requests.
    It simplifies the mapping of PATCH requests to specific handler methods in a controller.
28. @PathVariable
    is used to bind a method parameter to a URI template variable in a request mapping.
    It allows you to extract values from the URL and use them as method parameters.
29. @RequestParam
    is used to bind a method parameter to a query parameter in an HTTP request.
    It allows you to extract values from the request URL and use them as method parameters.
30. @RequestBody
    is used to bind the body of an HTTP request to a method parameter.
    It allows you to deserialize the request body into a Java object, typically in JSON or XML format.
31. @ExceptionHandler
    is used to define a method that handles specific exceptions thrown within a controller.
    It allows you to centralize exception handling and return appropriate responses to the client.
32. @ControllerAdvice
    is used to define a global exception handler for multiple controllers.
    It allows you to handle exceptions across the entire application in a centralized manner.
33. @CrossOrigin
    is used to enable Cross-Origin Resource Sharing (CORS) for a specific controller or method
    It allows you to specify which origins are allowed to access the resources, helping to prevent cross-origin request issues.
34. @ResponseStatus
    is used to specify the HTTP status code that should be returned for a specific exception or method.
    It allows you to customize the response status for different scenarios, such as returning 404 for resource not found.
35. @ResponseEntity
    is used to represent the entire HTTP response, including the status code, headers, and body.
    It allows you to have more control over the response returned from a controller method.


