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
        boolean conditionWhile = getCondition(); // Use a runtime condition
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }
    
    /**
     * Public method to demonstrate the bug.
     */
    public void showBug(I i) {
        foo(i);
    }

    /**
     * Helper method to provide a non-final condition that is always false.
     * This ensures the while loop above is unreachable but doesn't cause a compile error.
     */
    private boolean getCondition() {
        return false;
    }
}