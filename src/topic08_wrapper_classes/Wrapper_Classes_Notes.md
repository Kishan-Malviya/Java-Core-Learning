# Wrapper Classes
A wrapper class in Java is a predefined class that wraps around a primitive data type to convert it into an object.
It is used to represent a primitive value into its object form.
Because Java is an object-oriented language, many core features—such as collections (e.g., ArrayList), generics, and serialization—only work with objects, not raw primitive values.
Wrapper classes bridge this gap by providing an object representation for every primitive.

### The 8 Wrapper Classes
Each of Java's eight primitive types has a corresponding wrapper class located in the java.lang package:

| Primitive Type | Wrapper Class |
|----------------|---------------|
| byte           | Byte          |
| short          | Short         |
| int            | Integer       |
| long           | Long          |
| float          | Float         |
| double         | Double        |
| char | Character |

### Why use Wrapper Classes
1. Java Collections cannot store primitive values directly; they require objects.
Wrapper Classes can be used to represent primitive values in Java Collections.
2. Wrapper Classes provide built-in utility methods for to manipulate primitive values like parse, compare, format, etc.
3. Primitives must always hold a value, whereas wrapper class objects can be assigned null to represent an empty or missing state.

### Autoboxing and Unboxing
Java simplifies working with wrapper classes by automatically handling conversions between primitives and objects.

##### Autoboxing
Autoboxing is the process of converting the primitive value into its corresponding Wrapper Class object.

##### Unboxing
Unboxing is the process of converting the Wrapper Class object into its corresponding primitive value.

Examples,
```java
// Autoboxing: compiler automatically converts primitive int to Integer object
Integer objectNum = 25; 

// Unboxing: compiler automatically converts Integer object back to primitive int
int primitiveNum = objectNum;
```