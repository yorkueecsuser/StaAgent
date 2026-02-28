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

// Mutant added based on the Renaming Mutation Operator
class PreconditionsExampleMutant {

    public static void checkArgument(boolean expr, String errMsgTemplate, Object... errMsgArgs) {
        if (!expr) {
            throw new IllegalArgumentException(format(errMsgTemplate, errMsgArgs));
        }
    }

    private static String format(String tmpl, Object... argArray) {
        tmpl = String.valueOf(tmpl); // null -> "null"

        StringBuilder bld = new StringBuilder(tmpl.length() + 16 * argArray.length);
        int tmplStart = 0;
        int index = 0;
        while (index < argArray.length) {
            int phStart = tmpl.indexOf("%s", tmplStart);
            if (phStart == -1) {
                break;
            }
            bld.append(tmpl, tmplStart, phStart);
            bld.append(argArray[index++]);
            tmplStart = phStart + 2;
        }
        bld.append(tmpl, tmplStart, tmpl.length());

        // if there are unused arguments, append them in square braces
        if (index < argArray.length) {
            bld.append(" [");
            bld.append(argArray[index++]);
            while (index < argArray.length) {
                bld.append(", ");
                bld.append(argArray[index++]);
            }
            bld.append(']');
        }

        return bld.toString();
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