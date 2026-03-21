import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {if (false && true && false && false && false && false && true && false && true && false && false) {boolean stiqczps = true;}else{float tvkioxcv = 498306609;}
} // BUG: NullableOnContainingClass
}