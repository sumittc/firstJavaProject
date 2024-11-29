### Core Java Concepts
1. What is a wrapper class? Why were they invented, and where do we use them?
2. Is it possible to implement multiple inheritance in Java? Explain.
3. What happens if you use methods from the `java.lang` package without explicitly importing it?
4. Explain the difference between `StringBuilder` and `StringBuffer`.
5. Given `String s = new String("");`, how many objects are created, and how is memory allocated for this?
6. What is the difference between `LinkedList` and `ArrayList`?
7. What is the difference between `Set` and `Map`, and when should each be used?
8. Explain mutability and immutability.
9. How are String objects stored in memory in Java?
10. What is a functional interface?
11. Can an instance of an interface be created in Java? Explain how.
12. Can a constructor be static in Java?
13. Explain the difference between an abstract class and an interface.
14. What is the purpose of default methods in interfaces, especially since Java 8 allows them?
15. What is the difference between Java 8 HashMap and the traditional HashMap?
16. How does a HashMap work internally? Explain `hashCode` and `equals` methods.

### Threads and Concurrency
1. When should a multithreaded environment be used, and why?
2. Why are the `wait` and `notify` methods in the `Object` class?
3. What is the difference between a synchronized method and a synchronized block? Which is preferable and why?
4. Explain the producer-consumer problem with threads.
5. What is a race condition and a deadlock? Provide examples.
6. Write a thread-safe singleton class.
7. How do read/write operations happen if a block is synchronized?
8. What is a blocking queue in Java?
9. What are the ways to create a thread in Java? What is the preferable way?

### Exception Handling
1. How do you create a custom exception in Java?
2. Can a child class throw an exception if the parent class doesn't? Is the reverse possible?
3. Draw and explain the exception hierarchy in Java.

### Data Structures and Collections
1. What is the difference between `HashSet` and `TreeSet`?
2. Can a HashMap have duplicate keys?
3. What is the difference between `Collection` and `Collections` in Java?
4. Explain how to write hashing logic for an `Employee` class with `id`, `name`, and `salary` attributes.

### Java 8 Features and Functional Programming
1. Can a functional interface extend another interface?
2. What is the difference between `Supplier` and `Consumer` in Java 8?
3. How do you iterate over a list using lambda expressions?
4. Write Java 8 code to count the number of words in a string without using loops.
5. Write Java 8 code to get the names and salaries of the top 3 employees with the highest salaries.
6. How do you filter a list of employees based on salary using streams and return their names?
7. Write Java 8 code to find and print distinct strings from an array without using loops.
8. Write code to count the frequency of characters in a string using Java streams.

### Spring / Spring Boot
1. Why do we use the `@Autowired` annotation?
2. Which starter package have you used in your project?
3. Explain the annotations you know and why we use them.
4. What is the difference between Spring and Spring Boot?
5. What is the difference between `@RequestMapping` and `@GetMapping`?
6. What is the difference between `@RestController` and `@Controller`?
7. Can we create web applications using Spring Boot?
8. Have you used Hibernate? What is JPA? What is the difference between them?
9. Why should we use Spring Boot?
10. What is a cache?
11. Can a database be used as a cache?
12. What are HTTP response codes? What are 302 and 500 status codes?
13. If I call a bean multiple times from a client, how many objects are created? Can this be customized?
14. Explain your project architecture.
15. Explain the factory design pattern.
16. What is bean scope? Which one is the default?
17. How do you handle global exceptions in Spring Boot?
18. What is a topic in Kafka?
19. What are path variables and query parameters?
20. Explain the builder pattern with pseudo-code.
21. What is the circuit breaker design pattern? Have you used it?
22. What is Spring Boot Actuator?
23. What is the difference between `PUT` and `PATCH` methods?
24. What are fail-safe and fail-fast iterators?

### Microservices
1. Write a microservice to update or create student objects in the database.
2. What security mechanism have you implemented in your project (e.g., OAuth)?
3. Explain how your project uses microservices. Did you face any critical issues? How did you solve them?
4. Is HTTP stateless or stateful?
5. What is the difference between stateless and stateful microservices?
6. How do you call other microservices from one microservice?
7. If one microservice has a 5-second timeout and another has a 10-second timeout, how would you handle them sequentially?
8. Draw a microservice architecture with multiple servers and databases.
9. Have you used Docker?
10. Explain the CI/CD flow in your project.

### Design Patterns
1. What is the difference between the abstract factory and factory patterns?
2. If I autowire an interface and call its method, and only one class implements it, will it work?
3. What design patterns do you know?
4. What is sharding?

### DSA
1. In a 3x3 matrix, find the maximum sum and its elements from rows, columns, and diagonals.
2. Sort an array of 0s, 1s, and 2s.
3. Write code to create a SparkSession, read a CSV file, and filter records with null values in a specific column.
4. Given an array of coin values and an amount, write code to find the minimum number of coins required. Include JUnit tests.

### SQL
1. Write a SQL query to find numbers that appear three times consecutively.
2. Write a SQL query to find the current month's and last two months' spend.
3. Given a table with cities and distances, find unique distances between city pairs.
4. Find the third-highest employee record by salary per department. If the department has fewer than three employees, return the lowest salary.
5. What is a view, and why use it if you can fire the query directly?
6. What is the difference between a cross product and a full outer join?
7. Write a query to find the second-highest salary in each department.
8. Given two tables, return record counts for each join type (inner, outer).

### Managerial
1. Briefly explain your portfolio.
2. Explain ETL and Data Warehousing.
3. If 200 out of 1000 records are missing, how would you troubleshoot?
4. How would you approach a requirement that starts on Monday with a QA delivery on Friday?
5. What steps would you take before handing over a task to QA?
6. Do you have experience working in Agile projects?
7. Would you work extra hours or weekends for critical deliveries?
8. Why are you looking for a change?
9. If you have an offer already, how can we be sure you will join us?
10. From your assessment, where do you need improvement?