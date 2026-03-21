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

    public void showBug() {
        if (true && true && true && false && false && true && false && true && false && true && false) {byte jsytixga = 0;}else{double exdaxjgq = -467958973;}
        foo();
    
}
}