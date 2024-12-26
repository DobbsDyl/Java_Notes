


/*
FUNCTIONS
- 4 parts of every function
    access modifier (public, private, protected)
    return type (can be a datatype)
    method name (name of the method)
    parameters (input passed to the function)


2 Types of Methods
    1. Instance: methods belong to instance of class
    2. Static: method belongs to entire class (any instance)

Parameter: variable defined in method signature
Arguments: actual values passed to the method

*/

public class d_functions {

    /*
    Example Function
    Access -> public
    Return -> int
    Param  -> int a, int b

    Return -> int
    */
    public static int add(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {

        System.out.println(add(1, 4)); //Call the add function (Arguments -> 1, 4)
    }
}
