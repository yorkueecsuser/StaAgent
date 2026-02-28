import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotInitialized {

    // Introduced an unreachable switch statement
    default void dummyMethod() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This will never be printed");
                break;
            case 1:
                // This case is always executed
                System.out.println("This will always be printed");
                break;
        }
    }

    default boolean getCondition() {
        return false;
    }
}