Topics to cover -
Class
Objects
Constructor
Object Relationships
Inheritance
Polymorphism
Encapsulation
Abstraction
Interfaces
static keyword
final keyword
super keyword
this keyword
Coupling
Cohesion
Nested and Inner Classes
SOLID Design Principles
System Design Patterns


# OOP (Object Oriented Programming)
Object-Oriented Programming (OOP) is a programming style that organizes software design around data, or objects, rather than functions and logic.
Java is a class-based, object-oriented language, meaning everything you write is wrapped inside a class to represent real-world entities.

### The Two Foundations: Classes and Objects

##### Class:
A class is a blueprint (or template) which is used to create objects.
A class defines the variables (also calls - attributes or fields) & methods (also calls - behavior) which an object of that class will have.
A class takes up no memory until an object is created.
Here,
1. Attributes (Fields / Variables): These define the state or properties of the class.
For example, a Car class might have attributes like color, model, and current_speed.
2. Methods: These define the behavior or actions the objects can perform.
For example, the Car class might have methods like accelerate(), brake(), or turn().

##### Objects:
An Object is an instance of a class that holds state & behavior based on its class blueprint to represent real world entity.
An object occupies memory & stores in heap memory while its reference (memory address) is stored in reference variable.
Generally, Objects are created using new keyword.

### The Four Pillars of OOP in Java

##### Inheritance:
Inheritance allows a new class (subclass/child) to acquire the attributes and methods of an existing class (superclass/parent) using the extends keyword.
It promotes code reusability. Instead of writing the same code for a Car and a Truck, you can create a parent Vehicle class and have both classes inherit from it.

##### Polymorphism:
Polymorphism means "many forms". It allows a single method or object to behave differently depending on the context in which it is used. Java achieves this in two ways:
1. **Compile-time Polymorphism (Method Overloading):** Multiple methods in the same class share the same name but have different parameters.
2. **Runtime Polymorphism (Method Overriding):** A child class provides a specific implementation of a method that is already defined in its parent class.

##### Encapsulation:
Encapsulation is the practice of bundling data (variables) and the methods that operate on that data into a single unit (a class), while restricting direct access to some components.
Variables are declared as private. To access or modify them, other classes must use public getter and setter methods. This acts as a protective shield, enhancing data security.

##### Abstraction:
Abstraction is the process of hiding internal implementation details and showing only the essential features to the user.
In Java, this is achieved using abstract classes and interfaces.
Example: When you step on a car brake, you only need to know that the car will stop (the essential feature). You do not need to know the hydraulic mechanics happening under the hood (hidden implementation).