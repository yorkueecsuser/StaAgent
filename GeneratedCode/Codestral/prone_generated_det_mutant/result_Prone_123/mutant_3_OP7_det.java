import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {boolean zsgtdruw = false;while (zsgtdruw && true && true && false && true && true && true && true && true && false && true && false) {long vgkgtspb = -907291212;}
} // BUG: NullableOnContainingClass
}