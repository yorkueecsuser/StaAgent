import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {int evkbalpn = 0;switch  (evkbalpn) {case 1:short rnwdozwi = 3798;break;default:long tpqtgtym = -927162046;break;}
} // BUG: NullableOnContainingClass
}