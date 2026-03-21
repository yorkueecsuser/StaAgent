import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        boolean zqcxvqta = false;while (zqcxvqta && true && false && true && true && true && false && false && true && true && false && false) {byte desazdww = 64;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}