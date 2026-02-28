import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface PerformanceCritical {

    // Adding an unreachable for loop according to the mutation operator description
    boolean getCondition() {
        return false;
    }

    default void someMethod() {
        // This is a basic block where we can insert the unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop iteration.");
        }
    }
}