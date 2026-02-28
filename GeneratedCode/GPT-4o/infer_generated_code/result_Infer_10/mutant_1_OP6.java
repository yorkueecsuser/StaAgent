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
        // Inserting unreachable for loop
        boolean conditionFor = getCondition(); // Non-final variable to avoid unreachable error
        for (int j = 0; conditionFor; j++) {
            // Unreachable code block as conditionFor is always false
            System.out.println("This code is unreachable.");
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
     * Method to provide a false condition for the unreachable loop.
     */
    private boolean getCondition() {
        return false; // Ensures the loop is not entered
    }
}