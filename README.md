# Exercise - Spring Boot - Dependency Injection
* create a `Spring Boot` application using `Spring Initializr` that has the following dependencies:
  * `Lombok`
  * `Spring Boot DevTools`
  * `Spring Web`
* define a component called `MyComponent` where you have:
  * an instance string variable called `myComponentName`
  * a constructor that assigns your name to the instance variable
  * a method `getMyComponentName()` that returns the value of `myComponentImmutableName`
* define a service called `MyService` where you have:
  * a private variable `MyComponent`
  * a constructor where you apply constructor-based dependency injection
  * a method `getName()` that calls and returns `getMyComponentName()`
* define a controller called `MyController` where you have:
  * a private variable `MyService`
  * a constructor
  * a mapping to `/getName` in order to return the result of the `getName()` method of the `MyService` variable
  * a mapping to default root `/` that prints a welcome message
* notify the user through the console when a constructor or a method has been called:
  * e.g. `MyService.getName() has been called`
* when you launch and test your application on your `localhost`, you should see the following calls stack (in this order):
  * before calling `localhost:[portnumber]`:
    * `MyComponent constructor`
    * `MyService constuctor`
    * `MyContr0oller constructor`
  * after calling `localhost:[portnumber]/getName`
    * `MyService.getName()`
    * `MyComponent.getMyComponentName()`
