import java.lang.annotation.*;
import java.util.ArrayList;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface Expensive {}

class InfiniteExecutionExample {

    @Expensive // This annotation is used for demonstration purposes.
    public int squareRoot(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME​
            i++;
        }
        // Unreachable if-else statement added
        boolean condition = false; // Non-final variable used for condition
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Continuing execution.");
        }
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
        // Unreachable if-else statement added
        boolean condition = false; // Non-final variable used for condition
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Continuing execution.");
        }
    }

    public void callTopCost() {
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
        // Unreachable if-else statement added
        boolean condition = false; // Non-final variable used for condition
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Continuing execution.");
        }
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        loopOverCharArray(builder, input);
        return squareRoot(x);
        // Unreachable if-else statement added
        // This part of the code is unreachable because it is after a return statement.
        // However, for demonstration purposes, we place it here to follow the guidelines.
        
        // boolean condition = false; 
        // if (condition) {
        //     System.out.println("This branch is unreachable.");
        // } else {
        //     System.out.println("Continuing execution.");
        // }
    }
}