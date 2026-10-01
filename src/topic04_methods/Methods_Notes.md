# Methods
A method is a block of reusable code which is used to perform a specific task or business logic.
Methods act similarly to functions in other programming languages, but since Java is fully object-oriented, every method must be declared inside a class.

### Explanation: Structure of a Method
A method takes inputs (called parameters), executes actions, and returns an output value back to whoever called it.
Example,
```java
public int addNumbers(int num1, int num2) {
// Method body
int sum = num1 + num2;
return sum;
}
```
##### Terms Used:
1. **Access Modifier:** Defines who can see and access the method (e.g., public, private, protected, or default).
2. **Return Type:** The data type of the value the method sends back (e.g., int, String). If the method does not return a value, the keyword void is used.
3. **Method Name:** A unique identifier that typically starts with a lowercase verb and follows camelCase format.
4. **Parameter List:** Optional variables enclosed in parentheses that act as placeholders for input data passed into the method.
5. **Method Body:** The actual set of instructions that execute when the method is invoked.

### Types of Methods
Methods are broadly classified into two categories based on who created them:
1. **Predefined Methods:** Built-in options provided by the standard Java Library. Examples include System.out.println(), Math.max(), and String.length().
2. **User-defined Methods:** Custom logic written explicitly by the developer to tackle custom problem sets.

### Instance vs. Static Methods
**Instance Methods:**
1. These methods belong to the instance of a class.
2. These methods require an object to be instantiated first before calling the method.
3. These methods do not require any special keyword to be used while declaration.

**Static Methods:**
1. These methods belong to class itself.
2. These methods can be called directly using class name.
3. These methods require static keyword to be used while declaration.

### Pass-by-Value
Java is strictly pass-by-value, meaning that whenever you pass an argument to a method, Java creates a copy of the variable's value and passes that copy to the method.
The original variable outside the method is never directly altered by operations on the parameter itself.
The source of common confusion comes down to how Java handles the "value" of different data types.

##### Passing Primitive Type Values
When passing a primitive type variable as an argument in any method,
the copy of actual value created & used in the method's local parameter.
Example,
```java
public class Main {
    public static void main(String[] args) {
        int x = 5;
        modifyPrimitive(x);
        System.out.println(x); // Outputs: 5 (Unchanged)
    }

    public static void modifyPrimitive(int number) {
        number = 10; // Changes only the local copy
    }
}
```

##### Passing Reference Type Objects (String, Arrays, Custom Objects)
When passing an object, Java does not pass the actual object.
Instead, it passes a copy of the reference variable (the memory address) pointing to that object which is stored in the heap memory area.
Because both the original reference and the copied reference point to the exact same object in memory, modification can happen.
Example,
```java
class Dog {
    String name;
    Dog(String name) { this.name = name; }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        renameDog(myDog);
        System.out.println(myDog.name); // Outputs: Max
    }

    public static void renameDog(Dog dogRef) {
        dogRef.name = "Max"; // Modifies the object both references point to
    }
}
```