import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {boolean idruwjhp = false;while (idruwjhp && false && false && false && true && false && false && false && true && false && true && false) {double micyxqqs = 133031643;}
} // BUG: NullableOnContainingClass
}