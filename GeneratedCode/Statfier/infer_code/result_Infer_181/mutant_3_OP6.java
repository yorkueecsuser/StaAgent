import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface NoAllocation {

    // Mutant code added below
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void mutantCode() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
        }
    }
}