import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {if (false && true && true && false && false && false && true && false && true && false && false) {long lyxtrxgb = -463079302;}else{long xabrxabi = 124736880;}
} // BUG: NullableOnContainingClass
}