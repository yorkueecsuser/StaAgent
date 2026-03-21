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
        if (true && false && false && true && false && false && true && false && false && false && false) {long rhyzoihe = -630851949;}else{String odwxhzpp = "zupavdri";}
        foo();
    
}
}