import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
  ElementType.PACKAGE,
  ElementType.TYPE,
})
public @interface Verify {

    // Introduced an unreachable switch statement
    boolean getCondition() {
        return false;
    }

    int getValue() {
        return 0;
    }

    default void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Some code
        }

        int value = getValue();
        switch (value) {
            case 1:
                // Some code
                break;
            case 2:
                // Some code
                break;
            default:
                // Some code
                break;
        }

        // Unreachable switch statement
        int unreachableValue = getValue();
        switch (unreachableValue) {
            case 3:
                // This case is unreachable because getValue() always returns 0
                System.out.println("This is unreachable");
                break;
            case 4:
                // This case is also unreachable
                System.out.println("This is also unreachable");
                break;
        }
    }
}