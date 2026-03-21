import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        if (false && true && false && true && false && false && true && true && true && true && false) {int ahsfwumi = -124934215;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}