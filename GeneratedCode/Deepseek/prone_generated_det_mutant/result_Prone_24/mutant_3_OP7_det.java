import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        boolean fzsukqsd = false;while (fzsukqsd && true && false && true && true && true && true && true && false && true && false && false) {double qoieqnyc = 219372401;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}