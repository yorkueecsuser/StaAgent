import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {boolean howanbxm = false;while (howanbxm && true && false && false && true && false && false && false && true && false && true && false) {int dhhcgtms = -648869535;}
} // BUG: NullableOnContainingClass
}