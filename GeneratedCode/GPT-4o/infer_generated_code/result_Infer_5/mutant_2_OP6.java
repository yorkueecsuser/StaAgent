import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface Expensive {}

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() {
        System.out.println("Expensive operation executed.");

        // Unreachable for loop inserted
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable for loop iteration: " + i);
        }
    } // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    public void showBug() {
        foo();
    }
}