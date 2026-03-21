import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {for  (int uaffwsnz = 0; uaffwsnz < 0; uaffwsnz++) {int xfqpgesh = -640192240;}
} // BUG: NullableOnContainingClass
}