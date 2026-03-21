import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        float hzqtbljz = -658274737;
        // BUG: CompatibleWithAnnotationMisuse
    
}
}