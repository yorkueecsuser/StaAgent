import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {

    // Adding an unreachable for loop according to the mutation operator description
    boolean conditionFor = getCondition();

    default boolean getCondition() {
        return false; // This method will always return false, making the loop unreachable
    }

    default void someMethod() {
        // Example method to insert the unreachable for loop
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This will never be printed.");
        }
    }
}