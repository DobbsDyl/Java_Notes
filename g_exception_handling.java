
import java.io.FileInputStream;
import java.io.IOException;

/*
EXCEPTION HANDLING

Exception: events disrupting flow of execution
    - the Throwable class has 2 subclasses:
        a. Exception - recoverable errors, handled in code
        b. Error - irrecoverable, serious issues like OutOfMemory
    
2 Exception Types
    Checked Exception
        - checked at compile time
        - can be handled with try-catch blocks or declaring it with throws
        - Ex. IOException, SQLException
    
    Unchecked Exception
        - occur at runtime (not checked at compile time)
        - indicate programming errors
        - Ex. NullPointerException, ArithemeticException

Try, Catch, Finally, throw, and throws

    try - contains code that may have an exception
    catch - handle the exception in the try block
    finally - executes after try and catch blocks, if an error has occured or not

    throw - explicitly throws an exception
    throws - declares a method might throw an exception

Final, Finally, Finalize()
    final: used to declare constants, prevent inheritance, restrict method overriding
    finally: block used to execute important code (cleanup). Will run even if exception occurs
    finalize(): method in Object class that the garbage collectoer calls before destroying an object

User Defined Exceptions
    Can define custom exception by extending the exception class
*/

public class g_exception_handling {
    
    public static void main(String[] args) {
        
        /*
        Try, Catch, Finally 

        Flow Control:
            - if an exception occurs in the try block:
            1. remaining code in try block is skipped
            2. control transfers to catch block
            3. after catch executed, control transferred to finally block
        */
        try {
            int data = 100 / 0; // cannot dvivide by 0, ArithemeticException
            System.out.println("This line will print if no exception occurs.");
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by 0, ArithemeticException caught.");
        } finally {
            System.out.println("Finally Block will always execute");
        }

        /*
        Throw vs Throws 

        throw - can explicitly throw an exception
        throws - declares a method might throw one or more exceptions
        */
        int age = 22;

        // throw
        try {
            if (age >= 21) {
                throw new ArithmeticException("Access Denied - Must be 21 years old.");
            }
        } catch (ArithmeticException e) {
            System.out.println("throw: " + e.getMessage());
        }

        // throws
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("throws: " + e.getMessage());
        }

        /*
        User-Defined Exceptions 
        */
        try {
            checkAge(age); 
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

    }

    /*
    thows method
    */
    public static void readFile() throws IOException {
        FileInputStream file = new FileInputStream("file.txt");
    }

    /*
    User-Defined Exception Method
    */
    public static void checkAge(int age) throws AgeException {
        if (age < 21) {
            throw new AgeException("Age is below required minimum.");
        }
    }
}

/*
User-Defined Exception Class
*/
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}