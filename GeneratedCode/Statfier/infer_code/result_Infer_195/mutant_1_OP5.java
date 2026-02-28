import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotInitialized {

    // Added mutant code to introduce an unreachable switch statement
    boolean getCondition() {
        return false;
    }

    default void mutantMethod() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This will never be printed");
                break;
            case 2:
                System.out.println("This will also never be printed");
                break;
            default:
                System.out.println("Default case will never be reached");
                break;
        }
    }

    default int getValue() {
        return 0; // This ensures the switch statement is always unreachable
    }
}