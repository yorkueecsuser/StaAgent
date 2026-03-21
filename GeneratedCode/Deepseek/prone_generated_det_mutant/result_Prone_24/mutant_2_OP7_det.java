import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        boolean zedtqtto = false;while (zedtqtto && false && false && false && true && true && true && true && true && true && true && false) {long fvdgmizd = -448660170;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}