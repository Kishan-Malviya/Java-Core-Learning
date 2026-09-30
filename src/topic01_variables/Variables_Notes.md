# Variables
Variables are data containers which are used to store data values during program execution.

### How to create a variable

##### Declaration (Not Assigning any value)
int age;

##### Initialization (Assigning any value)
age = 25;

##### Declaration and Initialization in one line
String name = "John"; 

### Terminology
* Data Type - It defines what kind of data the variable can hold.
* Variable Name - It is a unique identifier which is used to access data.
* Value - The actual data which is stored in memory & accessed by variable.

### Types of Variable
1. Local Variables - These topic01_variables are declared inside methods, constructors &, blocks. These topic01_variables only exists while method is being executed. These do not hold any default values & must be initialized before use.
2. Instance Variable - These topic01_variables are declared inside any class but outside any methods, constructors &, blocks. These topic01_variables exist when object is created for that class & destroyed when object is destroyed. These topic01_variables holds default values if not initialized.
3. Static Variables - These topic01_variables are declared inside any class using static keyword. These topic01_variables are shared among all instances of the class & exists for entire duration of program. These topic01_variables also holds default values if not initialized.