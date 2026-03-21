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
        boolean vvvqzdvh = false;while (vvvqzdvh && false && true && false && true && true && false && true && false && true && true && false) {byte hcvxxqaq = 71;}
        foo();
    
}
}