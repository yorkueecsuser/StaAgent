import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        // BUG: CompatibleWithAnnotationMisuse
        // Mutation Operator: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // unreachable code
        } else {
            System.out.println("This code is unreachable due to the mutation");
        }
    }
}