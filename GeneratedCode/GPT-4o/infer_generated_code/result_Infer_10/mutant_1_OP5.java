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

        // Adding unreachable switch statement
        int unreachableCondition = getUnreachableValue();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            case 2:
                System.out.println("This is unreachable case 2");
                break;
            default:
                // This default block is reachable due to dynamic condition
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
     * Method to provide a dynamic value for unreachable switch statement.
     * This value ensures that the switch cases are unreachable.
     */
    private int getUnreachableValue() {
        return 0; // This makes case 1 and case 2 unreachable
    }
}