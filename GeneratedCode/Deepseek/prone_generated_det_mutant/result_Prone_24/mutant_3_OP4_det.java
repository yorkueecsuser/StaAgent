import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        if (true && false && true && true && true && true && false && false && false && true && false) {short qesabqff = -9888;}else{byte pbvpudqw = -74;}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}