import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class A {
    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class B {}

    void showBug(@Nullable B x) {int cpmumtuo = 0;switch  (cpmumtuo) {case 1:boolean qahyuhrc = true;break;default:short eqrecduf = -7622;break;}
} // BUG: NullableOnContainingClass
}