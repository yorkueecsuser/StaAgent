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
    }

    public static void main(String[] args) {
        PreconditionsExample example = new PreconditionsExample();
        example.showBug(17); // This will throw an IllegalArgumentException
    }
}

// Mutated code with renamed variable
class PreconditionsExampleMutant {

    public static void checkArgument(boolean e, String eTemplate, Object... eArgs) {
        if (!e) {
            throw new IllegalArgumentException(format(eTemplate, eArgs));
        }
    }

    private static String format(String t, Object... a) {
        t = String.valueOf(t); // null -> "null"

        StringBuilder b = new StringBuilder(t.length() + 16 * a.length);
        int tStart = 0;
        int i = 0;
        while (i < a.length) {
            int pStart = t.indexOf("%s", tStart);
            if (pStart == -1) {
                break;
            }
            b.append(t, tStart, pStart);
            b.append(a[i++]);
            tStart = pStart + 2;
        }
        b.append(t, tStart, t.length());

        // if there are unused arguments, append them in square braces
        if (i < a.length) {
            b.append(" [");
            b.append(a[i++]);
            while (i < a.length) {
                b.append(", ");
                b.append(a[i++]);
            }
            b.append(']');
        }

        return b.toString();
    }

    public void showBug(int a) {
        // This is where the bug is demonstrated. The message uses %d instead of %s.
        checkArgument(a >= 18, "Age must be at least %d years old", a); // BUG: PreconditionsInvalidPlaceholder
    }

    public static void main(String[] args) {
        PreconditionsExampleMutant example = new PreconditionsExampleMutant();
        example.showBug(17); // This will throw an IllegalArgumentException
    }
}