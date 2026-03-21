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
        int wdeozdxj = 0;switch  (wdeozdxj) {case 1:double rwfcsqll = -914474767;break;default:long scorzsjy = -408190979;break;}
        foo();
    
}
}