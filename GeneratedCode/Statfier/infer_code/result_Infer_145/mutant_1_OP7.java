import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface PerformanceCritical {
    // Introduced an unreachable while loop as per the mutation operator
    boolean conditionWhile = getCondition();
    default boolean getCondition() {
        return false;
    }

    static void introduceUnreachableLoop() {
        boolean conditionWhile = getStaticCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
            System.out.println("This is an unreachable loop");
        }
    }

    static boolean getStaticCondition() {
        return false;
    }
}