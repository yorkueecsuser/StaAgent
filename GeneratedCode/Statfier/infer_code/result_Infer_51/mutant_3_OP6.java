import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotNullable {

    // Inserting an unreachable for loop
    boolean getCondition() {
        return false; // This method will always return false, making the loop condition dynamically determined
    }

    default void someMethod() {
        // Example method to insert the unreachable for loop into
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This loop is unreachable");
        }
    }
}