import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        // BUG: CompatibleWithAnnotationMisuse
        int unreachableValue = 0;
        // Unreachable switch statement
        switch (unreachableValue) {
            case 0:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }
}