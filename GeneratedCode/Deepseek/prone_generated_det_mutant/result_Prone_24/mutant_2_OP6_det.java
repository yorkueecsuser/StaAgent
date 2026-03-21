import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        for  (int qidnixay = 0; qidnixay < 0; qidnixay++) {float veoiscqd = 887453271;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}