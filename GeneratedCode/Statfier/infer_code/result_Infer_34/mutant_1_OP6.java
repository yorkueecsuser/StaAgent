import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * add this annotation to a field to tell the static analyser that it should not be mutated, making
 * tighter restrictions than normal. e.g. an @Immutable array can't have elements reassigned or to a
 * method to tell that the return value shouldn't be mutated past that point
 */
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Immutable {

    // Adding an unreachable for loop according to the mutation operator description
    public void someMethod() {
        // Original code (none in this method, but adding the mutant as per requirement)
        
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will never return true
            System.out.println("This loop is unreachable");
        }
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This ensures the loop condition is always false at runtime
    }
}