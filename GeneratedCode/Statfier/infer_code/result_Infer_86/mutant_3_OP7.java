import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a privacy source should not flow to this parameter
)
public @interface PrivacySink {
    // Adding an unreachable while loop as per the mutation operator
    boolean conditionWhile = getCondition();

    default boolean getCondition() {
        return false;
    }

    default void dummyMethod() {
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }
    }
}