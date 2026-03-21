import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        int bobgsvyw = 0;switch  (bobgsvyw) {case 1:boolean iyqbtgmf = true;break;default:boolean olsermvh = false;break;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}