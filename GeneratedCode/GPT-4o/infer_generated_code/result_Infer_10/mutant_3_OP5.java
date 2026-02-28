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
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
        
        // Inserting unreachable switch statement
        int condition = getCondition();
        switch (condition) {
            case 1:
                // This case will never be reached because getCondition() always returns 0
                System.out.println("Unreachable case");
                break;
            default:
                // Default case also not reached due to the condition being 0
                break;
        }
    }

    /**
     * Public method to demonstrate the bug.
     */
    public void showBug(I i) {
        foo(i);
    }
    
    /**
     * Helper method to provide a condition value.
     * This method returns 0, making the switch statement unreachable.
     */
    private int getCondition() {
        return 0;
    }
}