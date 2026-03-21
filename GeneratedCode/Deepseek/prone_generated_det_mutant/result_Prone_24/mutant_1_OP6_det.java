import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        for  (int ckfcrvqt = 0; ckfcrvqt < 0; ckfcrvqt++) {boolean jcebkfew = true;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}