/*
Basic syntax for java program
*/

public class b_syntax_variables_datatypes {
    public static void main(String[] args) {
        System.err.println("Hello World");
    

/*
DATA TYPES
1. Primitive -      byte, short, int, long, float, double, boolean, char
    - stored in stack (hold values)
    - fixed in size

2. Non-Primitive -  String, Arrays, Classes, Enums, Interfaces, Records
    - stored in heap memory (hold reference to object)
    - vary in size
*/

/*
VARIABLES AND CONSTANTS
Variables: containers that store data values, each variable given a data type
Constants: variables cannot change values once set

Variables can have three types:
Local: variables defined inside a block {..}
Instance: defined in a class (outside any methods), belong to an instance of a class
Static: belong to the class itself and are shared among all instances

Naming must follow these rules:
1. must begin with a letter, $, _
2. cannot use keyword as names
3. are case sensitive
*/
    int age = 25;
    final double PI = 3.14159;

/*
OPERATORS
Java provides operators to perform various tasks:

Arithmetic Operators: +, -, *, /, %
Comparison Operators: ==, !=, >, <, >=, <=
Logical Operators: && (and), || (or), ! (not)
Assignment Operators: =, +=, -=, *=, /=, %=
*/

/*
WRAPPER CLASS
Primitive types can be converted to their wrapper class equivalent (vice-versa)
    int → Integer, double → Double, boolean → Boolean

Boxing: primitve -> wrapper class (Interger i = 10;)
Unboxing: wrapper -> primitive (int num = i)
*/
    int radius = 5; // Local variable
    double area = PI * Math.pow(radius, 2); // Using an operator and Math library

    Integer wrappedRadius = radius; // Autoboxing primitive int to Integer
    System.out.println("Area of circle: " + area);
    System.out.println("Wrapped radius: " + wrappedRadius);
    }

}





