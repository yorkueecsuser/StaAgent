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
        boolean conditionFor = getCondition(); // Non-final variable for unreachable loop
        for (int j = 0; conditionFor; j++) {
            // Unreachable for loop
        }
        
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME​
            i++;
        }
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        boolean conditionFor = getCondition(); // Non-final variable for unreachable loop
        for (int j = 0; conditionFor; j++) {
            // Unreachable for loop
        }
        
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
    }

    public void callTopCost() {
        boolean conditionFor = getCondition(); // Non-final variable for unreachable loop
        for (int j = 0; conditionFor; j++) {
            // Unreachable for loop
        }
        
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        boolean conditionFor = getCondition(); // Non-final variable for unreachable loop
        for (int j = 0; conditionFor; j++) {
            // Unreachable for loop
        }
        
        loopOverCharArray(builder, input);
        return squareRoot(x);
    }
    
    // Method to simulate a condition for control structures
    private boolean getCondition() {
        return false; // This will ensure the loop never runs
    }
}