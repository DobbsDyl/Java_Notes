

/*
FLOW CONTROL

1. Conditional: if, if-else, if-else if-else
2. Looping: for, for-each, while, do-while
3. Jump statements: break, continue
*/

public class e_flow_control {

    public static void main(String[] args) {
        
        /*
        CONDITIONAL 
        */
        System.out.println("--Conditionals--");
        int x = 1;

        //if
        if (x == 1) {
            System.err.println("True, x = 1");
        }

        //if-else
        
        if (x == 0) {
            System.out.println("True if x = 0");
        } else {
            System.out.println("If x != 0, print. Only this line will print");
        }

        //if-else if-else
        if (x == 0) {
            System.out.println("True if x = 0");
        } else if (x == 1) {
            System.out.println("True if x = 1");
        } else {
            System.out.println("If x != 0 and x != 1. Only this line will print.");
        }
        
        /*
        LOOPING
        */
        System.out.println("\n--Looping--");

        // loop - ex. loop will run 5 times (iterations), printing values 1-5
        int iterations = 5; //determines number of loop iterations
        
        for (int increment = 1; increment <= iterations; increment++) {
            System.out.print(increment + " ");
        }
        System.out.println();

        // enhanced loop - allows for looping over an array/list/collection/etc.
        int[] numbers = {1,2,3,4,5}; //array that will be looped through

        for (int number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // while loop - loop will repeat aslong as a condition is true
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("While Loop finishes when count reaches: " + count);

        // do-while - similar to while, except the loop will always run once
        count = 1;  //
        do {
            System.out.print(count + " ");
            count++;
        } while (count <= 5);
        System.out.println("Do-while Loop finishes when count reaches: " + count);


        /*
        JUMP STATEMENTS 
        */
        System.out.println("\n--Jump Statements--");


        // break - imediatly exits the loop
        iterations = 5; //determines number of loop iterations
        
        for (int increment = 1; increment <= iterations; increment++) {
            
            if (increment == 3) { //this will stop the loop when increment == 3
                break;
            }

            System.out.print(increment + " "); // only numbers 1,2 will print
        }
        System.out.println("break will stop loop when increment == 3.");

        // continue - skip current loop iteration and move to the next
        for (int i = 0; i < 10; i++) {
            
            if (i % 2 == 0) { // if i is an even number
                continue;   // continue to next iteration, skip even numbers
            }

            System.out.print(i + " "); // will only print odd numbers
        }
        System.out.println("continue will skip loop iterations, only odd numbers print");

    }
}

