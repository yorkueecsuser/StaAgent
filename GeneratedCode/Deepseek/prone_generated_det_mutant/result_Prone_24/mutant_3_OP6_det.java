import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        for  (int ibnuccje = 0; ibnuccje < 0; ibnuccje++) {boolean trzzllpi = true;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}