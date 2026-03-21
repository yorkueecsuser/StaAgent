import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {for  (int heibyudb = 0; heibyudb < 0; heibyudb++) {float aykhfqxq = -476626574;}
} // BUG: NullableOnContainingClass
}