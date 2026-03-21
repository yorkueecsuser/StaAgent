import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {if (true && false && true && false && true && false && false && false && true && false && false) {double suhknpai = 38452319;}
} // BUG: NullableOnContainingClass
}