import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {
    // Introduced an unreachable while loop with a dynamic condition
    static void introduceUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable loop.");
        }
    }

    // Helper method to provide a dynamic condition
    static boolean getCondition() {
        return false; // This will ensure the loop is never executed
    }
}