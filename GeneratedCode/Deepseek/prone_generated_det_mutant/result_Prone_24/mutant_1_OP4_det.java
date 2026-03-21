import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        if (true && true && true && true && true && true && true && true && true && false && false) {String bbfyijoj = "fikayuvk";}else{char ekpsjdbw = 'w';}
        // BUG: CompatibleWithAnnotationMisuse
    
}
}