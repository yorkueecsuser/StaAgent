import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface PerformanceCritical {

    // Added an unreachable switch statement
    default void dummyMethod() {
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                // This case will never be executed
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case will also never be executed due to the nature of the switch
                System.out.println("This is also an unreachable case.");
                break;
        }
    }

    default boolean getAlwaysFalse() {
        return false;
    }
}