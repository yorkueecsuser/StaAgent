import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        if (false && true && true && true && true && true && false && true && false && true && false) {String rfeimsxz = "gkxhqizd";}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}