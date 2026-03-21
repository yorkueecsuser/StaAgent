import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        if (false && false && false && false && false && false && false && false && true && false && false) {float ydwafltr = 144896988;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}