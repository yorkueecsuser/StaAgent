import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class NullableOnContainingClassExample {

    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class InnerClass {}

    static class StaticInnerClass {}

    void testMethod(InnerClass x) {} // Correct usage

    void testMethod(StaticInnerClass x) {} // Correct usage

    void testMethod(@Nullable InnerClass x) {if (true && false && true && true && false && true && true && false && false && true && false) {short dzioocls = -7798;}else{long khkaddqx = 713040313;}
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