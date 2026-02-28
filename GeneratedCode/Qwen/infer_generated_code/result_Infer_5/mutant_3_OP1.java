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
        String yqjvbnrt = "unused"; // Dead store mutation
    }

    public void showBug() {
        foo();
        int mnbvcxza = 42; // Dead store mutation
    }
}