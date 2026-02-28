import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {

    // Adding an unreachable for loop according to the mutation operator description
    default void generateUnreachableLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
        }
    }

    default boolean getCondition() {
        return false; // This method will always return false, making the loop unreachable
    }
}