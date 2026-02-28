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
    // Adding an unreachable if statement according to the mutation operator
    default void dummyMethod() {
        boolean condition = getCondition();
        if (condition) {
            // This is a reachable block
            System.out.println("This is a reachable block.");
        }
        // Unreachable if statement
        if (!condition && getUnreachableCondition()) {
            // This block is intended to be unreachable
            System.out.println("This is an unreachable block.");
        }
    }

    default boolean getCondition() {
        return true; // This method always returns true
    }

    default boolean getUnreachableCondition() {
        return false; // This method always returns false, ensuring the if block is unreachable
    }
}