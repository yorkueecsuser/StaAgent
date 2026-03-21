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
        int obfnzyvh = 0;switch  (obfnzyvh) {case 1:double gsadyqtu = 825923061;break;default:float meczjrxj = 798754268;break;}
        foo();
    
}
}