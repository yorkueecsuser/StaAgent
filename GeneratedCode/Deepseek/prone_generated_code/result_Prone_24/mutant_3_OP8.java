import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        // BUG: CompatibleWithAnnotationMisuse
    }

    // Newly added mutated Java code
    public static void showBug_Mutant(@CompatibleWith("String") String param1) {
        // Mutant code being added MUST be unique not generic.
    }
}