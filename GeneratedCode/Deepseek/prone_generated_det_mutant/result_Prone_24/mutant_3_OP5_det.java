import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        int invdqsuh = 0;switch  (invdqsuh) {case 1:byte zjzpenbr = 57;break;default:byte thqmgjho = 75;break;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}