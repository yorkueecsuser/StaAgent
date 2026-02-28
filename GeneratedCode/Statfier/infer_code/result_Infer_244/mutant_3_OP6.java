import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
public @interface AutoCleanup {

    // Adding an unreachable for loop according to the mutation operator
    boolean getCondition() {
        return false;
    }

    default void dummyMethod() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
        }
    }
}