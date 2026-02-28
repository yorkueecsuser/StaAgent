import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        boolean condition = false;
        if (condition) {
            // The unreachable statement
            System.out.println("This code will never be executed");
        }
    }
}