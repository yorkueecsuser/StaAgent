import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressReturnOverAnnotated {

    // Introduced an unreachable for loop according to the mutation operator description
    boolean conditionFor = getCondition();
    default boolean getCondition() {
        return false;
    }

    static void introduceUnreachableLoop() {
        boolean conditionFor = getStaticCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
    }

    static boolean getStaticCondition() {
        return false;
    }
}