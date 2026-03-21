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
        for  (int hxgiyasd = 0; hxgiyasd < 0; hxgiyasd++) {String nmfmsriu = "wmmlulws";}
        foo();
    
}
}