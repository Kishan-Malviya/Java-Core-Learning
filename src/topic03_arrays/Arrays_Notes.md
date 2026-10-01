# Arrays
An array is a fixed size container that holds a fixed number of values of same data type in contiguous memory locations.
Instead of declaring separate variables for each value, you can use an array to store a collection of data—such as numbers, strings, or custom objects—under a single variable name.

### Features of Array
1. Once an array is created, its capacity cannot grow or shrink.
2. Every item in the array must be of the same data type (e.g., all int or all String).
3. Array elements are accessed using a index values (the first element is at index 0, and the last is at arr.length - 1).
4. Memory for arrays is allocated on the heap memory area.
When initialized without values, default values are initialized.
example, 0 (for numeric types), false (for booleans), or null (for object references).
5. Attempting to look up an index that doesn't exist (like luckyNumbers[10] or a negative position) throws a runtime exception called ArrayIndexOutOfBoundsException.

### How to Declare and Initialize Arrays
There are two primary ways to create an array in Java:
##### 1. Specifying the Size (Instantiation):
Use this approach when you know how many items the array should hold, but you don't know the values yet.
eg, int[] arr = new int[5];
arr[0] = 1;

##### 2. Using an array literal:
Use this approach if you already know the exact values at the time of creation.
eg, String[] cars = {"BMW", "TATA", "Mahindra"};

### Array Operations

##### 1. Accessing element
int[] myNum = {10, 20, 30, 40};
System.out.prinln(myNum[0]); // prints 10

##### 2. Modifying Element
int[] myNum = {10, 20, 30, 40};
myNum[0] = 9;
System.out.prinln(myNum[0]); // prints 9

##### 3. Finding Array Length
String[] cars = {"BMW", "TATA", "Mahindra", "Porsche"};
System.out.println(cars.length); // Outputs 4

##### 4. Iterating (Traversing) Through an Array
The most efficient way to step through array elements is with a loop.
eg, int[] items = {1, 2, 3, 4, 5};

// Using a standard for loop
for (int i = 0; i < items.length; i++) {
System.out.println(items[i]);
}

// Alternatively, using an enhanced for-each loop
for (int item : items) {
System.out.println(item);
}

### Multi-Dimensional Arrays
Java also supports multidimensional arrays, which are essentially "arrays of arrays".
These are commonly used to represent tables, matrices, or grids.

Example,
// Declaration of 2D array with 3 rows and 4 columns
int[][] matrix = new int[3][4];

// Initializing with values
int[][] myNumbers = { {1, 2, 3}, {4, 5, 6} };
System.out.println(myNumbers[1][0]); // Outputs 4 (row 1, column 0)

### NOTES
1. Java provides a specialized loop syntax designed exclusively for traversing arrays and collection structures.
It simplifies the code by hiding index tracking and item retrieval.
2. • Enhanced for loops are strictly for reading data. Modifying the loop variable (price = 0;) will not change the actual values stored inside the underlying array.
3. If you need to rewrite elements, you must use a traditional indexed for loop (prices[i] = 0;).