# Control Flow Statements

Control flow statements in Java are programming features that determine the order in which individual statements, instructions, or function calls are executed.
By default, a Java compiler executes code sequentially from top to bottom.

Java categorizes its control flow statements into three main types:

### Decision-Making (Selection) Statements
These statements evaluate a boolean condition (true or false) to decide which block of code should run.
1. if statement - Executes a block of code only if the specified condition is true.
2. if-else statement - One block runs if the condition is true, and another runs if it is false.
3. if-else-if ladder statement - Evaluates multiple conditions sequentially until one matches.
4. switch statement - Tests a variable against multiple constant values (cases) and executes the matching block. It is a cleaner alternative to complex if-else ladders.
5. Ternary Operator statement - A shorthand operator used to evaluate a simple test condition as a quick alternative to if-else.

### Looping (Iteration) Statements
Loops are used to execute a specific block of code repeatedly as long as a certain condition is met.
1. for loop - Typically used when you know exactly how many times the loop should repeat. It initializes a variable, checks a termination condition, and increments/decrements the variable.
2. while loop - Evaluates a boolean condition at the top; repeats the code block continuously as long as the condition remains true.
3. do-while loop - Similar to a while loop, but it evaluates the condition at the bottom. This guarantees that the loop body will execute at least once before stopping.
4. enhanced for (for-each) loop - This is a specialized loop syntax designed exclusively for traversing arrays and collection structures. It simplifies the code by hiding index tracking and item retrieval.

### Branching (Jump) Statements
Jump statements alter the execution flow by instantly transferring control from one part of the program to another.
1. break - Terminates the execution of the innermost loop or switch block entirely, instantly skipping to the statement immediately following it.
2. continue - Skips the rest of the code in the current iteration of a loop and moves directly to the next iteration cycle.
3. return - Exits from the current method altogether and optionally passes a value back to the caller.

