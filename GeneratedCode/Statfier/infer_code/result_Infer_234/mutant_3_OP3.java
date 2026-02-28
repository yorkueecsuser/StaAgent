import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {

    // Mutant code added according to the mutation operator description
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant due to its method nature
    }

    default void mutantMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This is an unreachable if statement due to the condition always being false.");
        }
    }
}