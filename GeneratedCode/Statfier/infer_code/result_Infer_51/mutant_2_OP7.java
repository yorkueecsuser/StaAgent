import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotNullable {

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();

    default boolean getCondition() {
        return false;
    }

    default void someMethod() {
        // Some existing logic can be here
        System.out.println("Existing logic");

        // Inserting an unreachable while loop
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
            System.out.println("This will never be printed");
        }
    }
}