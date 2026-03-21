import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {int kfroopqq = 0;switch  (kfroopqq) {case 1:boolean ghnpcsew = false;break;default:boolean zmkydjvi = false;break;}
} // BUG: NullableOnContainingClass
}