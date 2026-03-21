import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {if (false && false && false && false && true && false && false && false && true && true && false) {char enzmlxgm = 'b';}
} // BUG: NullableOnContainingClass
}