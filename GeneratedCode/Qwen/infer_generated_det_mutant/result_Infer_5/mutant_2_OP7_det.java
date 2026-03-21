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
        boolean fhblodfh = false;while (fhblodfh && false && true && false && true && true && true && true && false && false && false && false) {long imrbbwzi = -607268309;}
        foo();
    
}
}