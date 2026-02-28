import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface PerformanceCritical {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    default boolean getCondition() {
        return false;
    }

    static void someMethod() {
        // Example method to demonstrate insertion of unreachable while loop
        boolean conditionWhile = getStaticCondition();
        while (conditionWhile) {
            // This loop is unreachable because getStaticCondition() always returns false
            System.out.println("This will never be printed.");
        }
    }

    static boolean getStaticCondition() {
        return false;
    }
}