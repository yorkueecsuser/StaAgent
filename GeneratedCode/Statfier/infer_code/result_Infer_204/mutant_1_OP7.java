import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface GeneratedGraphQL {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();

    default boolean getCondition() {
        return false;
    }

    default void someMethod() {
        // This method is just to have a basic block to insert the while loop
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
    }
}