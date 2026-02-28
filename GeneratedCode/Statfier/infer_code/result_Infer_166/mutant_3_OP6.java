import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressParameterNotNullable {

    // Adding an unreachable for loop as per the mutation operator description
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void someMethod() {
        // Some method to insert the unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This loop is unreachable");
        }
    }
}