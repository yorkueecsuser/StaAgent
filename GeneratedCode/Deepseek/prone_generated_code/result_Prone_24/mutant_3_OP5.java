import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    private static boolean isUnreachable = false;

    public static void showBug(@CompatibleWith("String") String param) {
        if (isUnreachable) {
            // This switch statement will never be executed due to the unreachable condition.
            switch (param) {
                case "unreachable":
                    System.out.println("Unreachable branch");
                    break;
            }
        }
    }
}