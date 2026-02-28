import java.util.Objects;

class PreconditionsExample {

    public static void checkArgument(boolean expression, String errorMessageTemplate, Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalArgumentException(format(errorMessageTemplate, errorMessageArgs));
        }
    }

    private static String format(String template, Object... args) {
        template = String.valueOf(template); // null -> "null"

        StringBuilder builder = new StringBuilder(template.length() + 16 * args.length);
        int templateStart = 0;
        int i = 0;
        while (i < args.length) {
            int placeholderStart = template.indexOf("%s", templateStart);
            if (placeholderStart == -1) {
                break;
            }
            builder.append(template, templateStart, placeholderStart);
            builder.append(args[i++]);
            templateStart = placeholderStart + 2;
        }
        builder.append(template, templateStart, template.length());

        // if there are unused arguments, append them in square braces
        if (i < args.length) {
            builder.append(" [");
            builder.append(args[i++]);
            while (i < args.length) {
                builder.append(", ");
                builder.append(args[i++]);
            }
            builder.append(']');
        }

        return builder.toString();
    }

    public void showBug(int age) {
        // This is where the bug is demonstrated. The message uses %d instead of %s.
        checkArgument(age >= 18, "Age must be at least %d years old", age); // BUG: PreconditionsInvalidPlaceholder

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("Neither will this.");
                break;
            default:
                System.out.println("Nor this.");
                break;
        }
    }
    
    private int getUnreachableValue() {
        return 0; // Always return 0 to ensure the switch cases are unreachable
    }

    public static void main(String[] args) {
        PreconditionsExample example = new PreconditionsExample();
        example.showBug(17); // This will throw an IllegalArgumentException
    }
}