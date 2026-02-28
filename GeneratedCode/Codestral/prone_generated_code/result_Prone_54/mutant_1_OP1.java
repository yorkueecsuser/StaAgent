import java.util.Random;

class FormatStringBug {
    public static void showBug() {
        // Introducing a Dead Store
        int unusedVariable = new Random().nextInt();

        // Bug: Duplicate flags are provided in the format specifier
        System.out.println(String.format("e = %++10.4f", Math.E));

        // Bug: A conversion and flag are incompatible
        System.out.println(String.format("%#b", Math.E));

        // Bug: The argument is a character with an invalid Unicode code point
        System.out.println(String.format("%c", 0x110000));

        // Bug: The argument corresponding to the format specifier is of an incompatible type
        System.out.println(String.format("%f", "abcd"));

        // Bug: An illegal combination of flags is given
        System.out.println(String.format("%-010d", 5));

        // Bug: The conversion does not support a precision
        System.out.println(String.format("%.c", 'c'));

        // Bug: The conversion does not support a width
        System.out.println(String.format("%1n", System.lineSeparator()));

        // Bug: There is a format specifier which does not have a corresponding argument
        System.out.println(String.format("%<s", "test"));

        // Bug: The format width is required
        System.out.println(String.format("e = %-f", Math.E));

        // Bug: An unknown conversion is given
        System.out.println(String.format("%r", "hello"));
    }
}