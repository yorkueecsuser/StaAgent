import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface NoAllocation {

    // Mutant code added to introduce an unreachable for loop
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void unreachableLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This loop is unreachable");
        }
    }
}