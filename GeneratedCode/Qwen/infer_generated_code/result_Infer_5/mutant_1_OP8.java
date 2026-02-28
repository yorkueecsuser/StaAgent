import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() {} // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    public void x() {} // Mutant: Renamed method from foo to x

    public void showBug() {
        foo(); // Original call to foo
        x();   // Call to the renamed method x
    }
}