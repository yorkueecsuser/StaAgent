import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        if (true && false && true && false && false && false && false && false && true && false && false) {short jnjnszjc = 4517;}else{short jlxuqiwv = -5777;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}