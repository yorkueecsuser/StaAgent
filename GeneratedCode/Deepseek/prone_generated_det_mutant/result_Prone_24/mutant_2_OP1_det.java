import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        boolean aamzrwop = false;
        // BUG: CompatibleWithAnnotationMisuse
    
}
}