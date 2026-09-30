# Data Types
Data types in Java specify the size and type of values that can be stored in a variable. Because Java is a statically typed language, every variable must be declared with a data type before it can be used.

#### Java categorizes data types into two primary groups:
1. Primitive Data Types
2. Non-Primitive (Reference) Data Types.

### Primitive Data Types
Primitive data types predefined/built-in data types which are used to store simple, raw values directly in memory and do not have built-in methods.

#### There are exactly eight primitive data types in Java:
* byte - Its size is 1 byte (8 bits) & stores whole numbers (from -128 to 127).
* short - Its size is 2 bytes (16 bits) & stores whole numbers (from -32768 to 32767).
* int - Its size is 4 bytes (32 bits) & stores whole numbers (from 2.14 billions to 2.14 billions).
* long - Its size is 8 bytes (64 bits) & stores very large whole numbers. It requires 'L' suffix during variable initialization.
* float - Its size is 4 bytes (32 bits) & stores decimal whole numbers. It requires 'f' suffix during variable initialization.
* double - Its size is 8 bytes (64 bits) & stores very large decimal whole numbers.
* boolean - Its size is 1 bit & stores true or false logical states.
* char - Its size is 2 bytes (16 bits) & stores a single 16-bit unicode character enclosed in single quotes (eg, 'A').

### Non-Primitive (Reference) Data Types
Non-primitive data types are custom data types (except for String, which is built-in but behaves as an object).
Instead of storing the actual value, they store a reference (memory address) to where the object is located in memory.

Key characteristics include the ability to call methods to perform operations, a default value of null, and a size that varies based on the object structure.

Examples, String, Arrays, Classes & Objects, Interfaces, etc.