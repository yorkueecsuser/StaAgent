import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullFieldAccess {

    // Introduced an unreachable while loop according to the mutation operator
    boolean getCondition() {
        return false;
    }

    default void introduceUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop.");
        }
    }
}