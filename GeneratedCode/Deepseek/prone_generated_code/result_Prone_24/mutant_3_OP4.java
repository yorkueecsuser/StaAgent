import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        // BUG: CompatibleWithAnnotationMisuse
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable code path");
        } else {
            System.out.println("Reachable code path");
        }
    }

    private static boolean getUnreachableCondition() {
        return false;
    }
}