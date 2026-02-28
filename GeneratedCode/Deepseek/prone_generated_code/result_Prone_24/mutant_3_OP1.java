import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        String deadStore1234 = "This is a dead store"; // Inserted Dead Store Mutation
        // BUG: CompatibleWithAnnotationMisuse
    }
}