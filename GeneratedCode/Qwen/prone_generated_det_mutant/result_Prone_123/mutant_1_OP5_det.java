import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class NullableOnContainingClassExample {

    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class InnerClass {}

    static class StaticInnerClass {}

    void testMethod(InnerClass x) {} // Correct usage

    void testMethod(StaticInnerClass x) {} // Correct usage

    void testMethod(@Nullable InnerClass x) {int xzrikjmm = 0;switch  (xzrikjmm) {case 1:char dqrqyste = 'g';break;default:double nhjjxwrp = -50510994;break;}
} // BUG: NullableOnContainingClass

    void testMethod(StaticInnerClass x) {} // Renamed to avoid conflict

    public InnerClass showBug() {
        return new InnerClass(); // This method demonstrates the bug by incorrectly annotating the outer class
    }

    public static void main(String[] args) {
        NullableOnContainingClassExample example = new NullableOnContainingClassExample();
        InnerClass inner = example.showBug();
        System.out.println(inner);
    }
}