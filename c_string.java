

/*
String: sequence of chars (in java.lang)
Immutable: string objects cannot be changed, any changes will will create a new string object
Instantiation: string can be created using literals or the new keyword
    - literals are more efficient because of string pooling
    String s = "Hello";
    String s = new String("Hello");

String Pool: special memory area in Javas heap to store string literals
    - when a string literal is created Java checks the string pool to see if an identical string already exists
        - if it does Java will reuse the existing String
    - If the new keyword is used:
        - bypasses the pool and creates a new object

StringBuilder and StringBuffer
- string alternatives
- used when strings need to be mutable (can change chars without making new string)

1. StringBuilder -> faster, not thread safe
2. StringBuffer  -> slower. thread safe 

Interning
- use intern() to add a String to the pool explicitly
- helps avoid duplicate strings
*/


public class c_string {

    public static void main(String[] args) {
        
    }
}
