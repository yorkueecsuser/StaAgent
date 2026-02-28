import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        // BUG: CompatibleWithAnnotationMisuse
        boolean condition = false; // Mutation: change the condition to false
        while (condition) {
            // Unreachable code
        }
    }
}