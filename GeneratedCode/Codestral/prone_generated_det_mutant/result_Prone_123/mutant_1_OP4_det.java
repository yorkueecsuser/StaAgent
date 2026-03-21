import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {if (true && false && false && false && false && true && true && true && false && false && false) {String zhsthsiu = "anruocij";}else{int qbundlia = 171657440;}
} // BUG: NullableOnContainingClass
}