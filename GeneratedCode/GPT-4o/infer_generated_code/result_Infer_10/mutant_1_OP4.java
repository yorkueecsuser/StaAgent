import java.lang.annotation.*;
import com.facebook.infer.annotation.*;

/**
 * Marker annotation used for static analysis to indicate thread-safety.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface ThreadSafe {}

/**
 * Interface I with a method bar that is not annotated with @ThreadSafe.
 */
interface I {
    void bar();
}

/**
 * Class C is annotated as @ThreadSafe but it uses an interface method that is not.
 */
@ThreadSafe
class C {
    /**
     * Method foo invokes the bar method from interface I, which lacks a @ThreadSafe annotation.
     * This is the source of the INTERFACE_NOT_THREAD_SAFE bug.
     */
    void foo(I i) {
        boolean condition = getCondition(); // Using a non-final variable for runtime condition
        if (condition) {
            i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
        } else {
            // This else branch is intended to be unreachable in typical scenarios
            // since getCondition() returns a deterministic false at runtime.
            System.out.println("This is an unreachable else branch.");
        }
    }
    
    /**
     * Public method to demonstrate the bug.
     */
    public void showBug(I i) {
        foo(i);
    }

    /**
     * A method to provide a runtime condition for the if-else statement.
     * It returns false simulating the unreachable branch.
     */
    private boolean getCondition() {
        return false;
    }
}