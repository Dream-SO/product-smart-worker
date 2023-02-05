# product-smart-worker

This is the structre of the project smart-worker

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── dreamso
│   │   │           └── smartworker
│   │   │               ├── controller
│   │   │               │   └── UserController.java
│   │   │               ├── dto
│   │   │               │   └── UserDto.java
│   │   │               ├── exception
│   │   │               │   ├── ApiError.java
│   │   │               │   ├── ApiValidationError.java
│   │   │               │   ├── EntityNotFoundException.java
│   │   │               │   └── RestExceptionHandler.java
│   │   │               ├── model
│   │   │               │   └── User.java
│   │   │               ├── repository
│   │   │               │   └── UserRepository.java
│   │   │               ├── service
│   │   │               │   ├── impl
│   │   │               │   │   └── UserServiceImpl.java
│   │   │               │   └── UserService.java
│   │   │               └── SmartWorkerApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── oas
│   │       │   └── openapi.yaml
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── dreamso
│                   └── smartworker
│                       └── SmartworkerApplicationTests.java
```
