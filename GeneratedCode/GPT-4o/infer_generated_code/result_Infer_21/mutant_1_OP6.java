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
        
        boolean conditionFor = getFalseCondition();
        for (int j = 0; conditionFor; j++) { // Unreachable for loop
            i += j;
        }
        
        return i;
    }

    @Expensive
    public void loopOverCharArray(StringBuilder builder, String input) {
        for (Character c : input.toCharArray()) { // BUG: INFINITE_EXECUTION_TIME​
            builder.append(c);
        }
        
        boolean conditionFor = getFalseCondition();
        for (int k = 0; conditionFor; k++) { // Unreachable for loop
            builder.append(k);
        }
    }

    public void callTopCost() {
        squareRoot(1); // BUG: INFINITE_EXECUTION_TIME​
        
        boolean conditionFor = getFalseCondition();
        for (int l = 0; conditionFor; l++) { // Unreachable for loop
            System.out.println(l);
        }
    }
    
    public int showBug(int x, StringBuilder builder, String input) {
        loopOverCharArray(builder, input);
        return squareRoot(x);
    }
    
    private boolean getFalseCondition() {
        // This method simulates a false condition for the unreachable loop
        return false;
    }
}