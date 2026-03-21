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
        int mrwkbeos = 0;switch  (mrwkbeos) {case 1:String rcftnsan = "axpfirzz";break;default:float maifxhqa = 7085213;break;}
        foo();
    
}
}