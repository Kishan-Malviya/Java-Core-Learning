# Strings
A String is an object that represents a sequence of characters.
It works similar to array of characters & any character in String object is accessed using index (starts with 0).

### Characteristics of String
1. **Immutability:** String objects are immutable, meaning their values cannot be changed after they are created.
Whenever you perform an operation that seems to modify a string (like appending text), Java actually creates a brand-new String object in memory.
2. **Non-Primitive Type:** A String is a reference type (a class), not a primitive data type like int or char.
This is why the word String begins with a capital letter.
3. **The String Constant Pool:** To save memory, the Java Virtual Machine (JVM) maintains a special memory area called the String Pool.
If you create multiple strings with the exact same literal value, Java reuses the same object from the pool instead of duplicating it.

### How to create a String
There are two primary ways to instantiate a string in Java:
1. **Using a String Literal (Recommended):**
````java
String greeting = "Hello, World!";
````
2. **Using the new Keyword:**
```java
String greeting = new String("Hello, World!");
```

### Commonly used String methods
The String class provides a rich set of built-in methods to manipulate and evaluate text:
1. **length():** This method takes no parameter & is used to return the count (length/number) of characters within a String object.
2. **charAt(int index):** This method takes one parameter & is used to access character based on index parameter.
3. **subString(int begin, int end):** This method takes two parameters & is used to extract sub-string.
4. **equals(Object obj):** This method takes one parameter (Another String Object) & is used to compare the actual content of both Strings.
5. **toUpperCase():** This method takes no parameter & is used to convert String object content into upper case.
6. **toLowerCase():** This method takes no parameter & is used to convert String object content into lower case.
7. **concat(String obj):** This method takes one parameter (Another String object) & is used to append the parameter with existing String object content.

### String Constant Pool
String Constant Pool is a special memory area inside the heap memory area.
It is used to store unique String literals.
If a String object is created using String Literal, object gets created inside String Constant Pool.

### String Immutability
Java strings are immutable (unchangeable after creation) primarily for security, memory efficiency, and thread safety.
Because strings are used everywhere in Java applications — from database configurations to network connections — keeping them immutable prevents accidental or malicious data corruption.
Below are major reasons for String immutability:
1. **Security:** Strings are heavily relied upon to store sensitive data like file paths, database URLs, usernames, and passwords.
If strings were mutable, a malicious script or an accidental code side - effect could alter these values after they have passed security checks.
2. **Memory Optimizations:** Java optimizes memory by sharing identical string literals in the String Constant Pool.
This optimization is only possible because strings cannot change.
   • The Conflict: If reference s1 and reference s2 both point to the literal "Java" in the pool, and strings were mutable, changing s1 to "JavA" would automatically change s2 as well. Immutability ensures that one variable cannot accidentally break the data of another.
3. **Thread Safety:** In multi-threaded programming, data corruption happens when multiple threads try to read and write to the same memory location simultaneously.
   The Benefit: Because a string cannot be modified once created, it is inherently thread-safe. Multiple threads can share and read the same string object concurrently without the need for complex synchronization locks, drastically improving performance.
4. **Hash Code Caching:** Strings are frequently used as keys in hashing-based collections like HashMap and HashSet.
   • The Optimization: When a string is created, its hash code is calculated and cached inside the object. Because the string is immutable, Java knows the hash code will never change. It doesn't need to recalculate it every time you look up a key, making collection operations incredibly fast.
   • If strings were mutable, changing the text would change the hash code, causing the object to become "lost" inside a HashMap.

### StringBuffer & StringBuilder
Both are classes in java which are used to create String objects which are mutable.
Unlike the standard String class—which creates a brand-new object in memory every single time you append or alter text—these two classes modify an internal, resizable character array without creating new objects.
This makes them significantly faster and more memory-efficient when performimg heavy text manipulation.