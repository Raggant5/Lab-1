/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
    // Code in a file does not automatically run in Java. You must define a method
    // called main in a class and tell Java to run the file containing that class
    public static void main(String[] args) { // This is the main method, the entry point of your program
        // ***** JAVA CALLS THE METHOD MAIN IN THE FILE YOU CHOOSE TO RUN ******
        int i = 1;
        while (i < 100)  { // Java for loop: (start, stop, increment/step)

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0; // Java variable declarations
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { // Java and is &&

            System.out.println("Fizz Buzz"); // system.out.println is java "print"

        } else if (divisibleBy3) { // Java elif is else if

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i = i + 1;
        return i;
    }
}
