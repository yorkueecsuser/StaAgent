import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        // BUG: CompatibleWithAnnotationMisuse
        int a = 0;
        if (a == 0) {
            System.out.println("This statement is reachable");
        } else {
            System.out.println("This statement is unreachable");
        }
    }
}