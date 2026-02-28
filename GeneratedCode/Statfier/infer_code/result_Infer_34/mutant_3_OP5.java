import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * add this annotation to a field to tell the static analyser that it should not be mutated, making
 * tighter restrictions than normal. e.g. an @Immutable array can't have elements reassigned or to a
 * method to tell that the return value shouldn't be mutated past that point
 */
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Immutable {

    // Adding an unreachable switch statement
    public void dummyMethod() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case will never be reached because getCondition() should return false
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case
                break;
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, ensuring the switch is unreachable
    }
}