import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() { 
        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        String abcdefgh = "unusedVariable"; // Dead store mutation
    }

    public void showBug() {
        foo();
        int hijklmno = 42; // Dead store mutation
    }
}