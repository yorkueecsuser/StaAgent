import java.lang.Math;

class FormatStringBug {
    public static void showBug() {
        // Bug: Duplicate flags are provided in the format specifier
        System.out.println(String.format("e = %++10.4f", Math.E));
        double a = Math.E;
        System.out.println(String.format("e = %++10.4f", a)); // Mutant: Renamed variable Math.E to a

        // Bug: A conversion and flag are incompatible
        System.out.println(String.format("%#b", Math.E));
        double b = Math.E;
        System.out.println(String.format("%#b", b)); // Mutant: Renamed variable Math.E to b

        // Bug: The argument is a character with an invalid Unicode code point
        System.out.println(String.format("%c", 0x110000));
        int c = 0x110000;
        System.out.println(String.format("%c", c)); // Mutant: Renamed variable 0x110000 to c

        // Bug: The argument corresponding to the format specifier is of an incompatible type
        System.out.println(String.format("%f", "abcd"));
        String d = "abcd";
        System.out.println(String.format("%f", d)); // Mutant: Renamed variable "abcd" to d

        // Bug: An illegal combination of flags is given
        System.out.println(String.format("%-010d", 5));
        int e = 5;
        System.out.println(String.format("%-010d", e)); // Mutant: Renamed variable 5 to e

        // Bug: The conversion does not support a precision
        System.out.println(String.format("%.c", 'c'));
        char f = 'c';
        System.out.println(String.format("%.c", f)); // Mutant: Renamed variable 'c' to f

        // Bug: The conversion does not support a width
        System.out.println(String.format("%1n", System.lineSeparator()));
        String g = System.lineSeparator();
        System.out.println(String.format("%1n", g)); // Mutant: Renamed variable System.lineSeparator() to g

        // Bug: There is a format specifier which does not have a corresponding argument
        System.out.println(String.format("%<s", "test"));
        String h = "test";
        System.out.println(String.format("%<s", h)); // Mutant: Renamed variable "test" to h

        // Bug: The format width is required
        System.out.println(String.format("e = %-f", Math.E));
        double i = Math.E;
        System.out.println(String.format("e = %-f", i)); // Mutant: Renamed variable Math.E to i

        // Bug: An unknown conversion is given
        System.out.println(String.format("%r", "hello"));
        String j = "hello";
        System.out.println(String.format("%r", j)); // Mutant: Renamed variable "hello" to j
    }
}