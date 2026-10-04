# Exception Handling
Exception handling is a mechanism that detects and manages runtime errors, ensuring that the normal flow of the application continues without crashing.
When an error occurs within a method, Java wraps the error details (name, description, and program state) into a special object called an Exception Object and hands it off to the runtime system.

### The Java Exception Hierarchy
All exception and error types are subclasses of the Throwable class, which splits into two main branches:
1. **Error:** An Error is an unexpected event which occurs during program execution (runtime) & can not be handled by exception handling mechanisms (try catch blocks).
Examples - OutOfMemoryError, StackOverflowError, etc.
2. **Exceptions:** An Exception is an unexpected event which occurs during program execution (runtime) & can be handled by exception handling mechanisms (try catch blocks).
Examples - NullPointerException, ArrayIndexOutOfBoundsException, etc.

Exception are further categorized into two types:

##### Checked Exceptions:
Checked Exceptions are type of exceptions which is checked by compiler during compile time & compiler suggests that a particular block of code might throw an exception. So, compiler forces to use exception handling mechanism.
Examples - IOException, FileNotFoundException, etc.

##### Unchecked Exceptions:
Unchecked Exceptions are type of exceptions which is not checked by compiler during compile time but can be handled using exception handling mechanism.
Examples - NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException, etc.

### Core Keywords for Handling Exceptions
try
catch
finally
throw
throws
