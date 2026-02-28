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

    public static void checkArgument(boolean expr, String errMsgTemplate, Object... errMsgArgs) {
        if (!expr) {
            throw new IllegalArgumentException(format(errMsgTemplate, errMsgArgs));
        }
    }

    private static String format(String tmpl, Object... parameters) {
        tmpl = String.valueOf(tmpl); // null -> "null"

        StringBuilder bldr = new StringBuilder(tmpl.length() + 16 * parameters.length);
        int tmplStart = 0;
        int idx = 0;
        while (idx < parameters.length) {
            int placeholderStart = tmpl.indexOf("%s", tmplStart);
            if (placeholderStart == -1) {
                break;
            }
            bldr.append(tmpl, tmplStart, placeholderStart);
            bldr.append(parameters[idx++]);
            tmplStart = placeholderStart + 2;
        }
        bldr.append(tmpl, tmplStart, tmpl.length());

        // if there are unused arguments, append them in square braces
        if (idx < parameters.length) {
            bldr.append(" [");
            bldr.append(parameters[idx++]);
            while (idx < parameters.length) {
                bldr.append(", ");
                bldr.append(parameters[idx++]);
            }
            bldr.append(']');
        }

        return bldr.toString();
    }

    public void showBug(int a) {
        // This is where the bug is demonstrated. The message uses %d instead of %s.
        checkArgument(a >= 18, "Age must be at least %d years old", a); // BUG: PreconditionsInvalidPlaceholder
    }

    public static void main(String[] args) {
        PreconditionsExampleMutant exampleMutant = new PreconditionsExampleMutant();
        exampleMutant.showBug(17); // This will throw an IllegalArgumentException
    }
}