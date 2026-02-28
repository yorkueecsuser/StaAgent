import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotInitialized {
    // Mutant code added here
    boolean conditionWhile = false;
    static {
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is false and not modified
        }
    }
}