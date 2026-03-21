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
        if (false && false && false && true && false && false && false && false && false && true && false) {long vfekjxoj = -536945003;}else{char dplcpaba = 'e';}
        foo();
    
}
}