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

    // Added mutant code with an unreachable switch statement
    public boolean getCondition() {
        return false;
    }

    public void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Some logic here
        }

        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This is unreachable");
                break;
            case 2:
                System.out.println("This is also unreachable");
                break;
        }
    }

    public int getValue() {
        return 0; // This ensures the switch statement is unreachable
    }
}