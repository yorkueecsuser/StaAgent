import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {

    // Mutant code being added
    boolean getCondition() {
        return false;
    }

    default void insertUnreachableLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }
    }
}