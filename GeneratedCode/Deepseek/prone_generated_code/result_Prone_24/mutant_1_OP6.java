import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        // BUG: CompatibleWithAnnotationMisuse
        for (boolean i = false; i == true; i = false) {
            // unreachable loop
        }
    }
}