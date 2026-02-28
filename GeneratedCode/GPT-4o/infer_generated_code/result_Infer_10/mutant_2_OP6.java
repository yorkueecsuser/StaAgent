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
        // Inserting an unreachable for loop
        boolean conditionFor = false; // This is a non-final variable to prevent compile-time optimization
        for (int j = 0; conditionFor; j++) {
            System.out.println("This will never be printed");
        }
    }
    
    /**
     * Public method to demonstrate the bug.
     */
    public void showBug(I i) {
        foo(i);
    }
}