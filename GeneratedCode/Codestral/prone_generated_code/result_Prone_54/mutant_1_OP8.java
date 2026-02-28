import java.lang.String;
import java.lang.Math;
import java.lang.System;

class FormatStringBug {
    public static void showBug() {
        // Original code
        System.out.println(String.format("e = %++10.4f", Math.E)); // BUG: FormatString

        // Bug: A conversion and flag are incompatible
        System.out.println(String.format("%#b", Math.E)); // BUG: FormatString

        // Bug: The argument is a character with an invalid Unicode code point
        System.out.println(String.format("%c", 0x110000)); // BUG: FormatString

        // Bug: The argument corresponding to the format specifier is of an incompatible type
        System.out.println(String.format("%f", "abcd")); // BUG: FormatString

        // Bug: An illegal combination of flags is given
        System.out.println(String.format("%-010d", 5)); // BUG: FormatString

        // Bug: The conversion does not support a precision
        System.out.println(String.format("%.c", 'c')); // BUG: FormatString

        // Bug: The conversion does not support a width
        System.out.println(String.format("%1n", System.lineSeparator())); // BUG: FormatString

        // Bug: There is a format specifier which does not have a corresponding argument
        System.out.println(String.format("%<s", "test")); // BUG: FormatString

        // Bug: The format width is required
        System.out.println(String.format("e = %-f", Math.E)); // BUG: FormatString

        // Bug: An unknown conversion is given
        System.out.println(String.format("%r", "hello")); // BUG: FormatString

        // Mutant code
        double e = Math.E;
        System.out.println(String.format("e = %++10.4f", e)); // Mutant: FormatString with renamed variable

        int binaryE = (int) Math.E;
        System.out.println(String.format("%#b", binaryE)); // Mutant: FormatString with renamed variable

        char invalidChar = (char) 0x110000;
        System.out.println(String.format("%c", invalidChar)); // Mutant: FormatString with renamed variable

        String invalidFloat = "abcd";
        System.out.println(String.format("%f", invalidFloat)); // Mutant: FormatString with renamed variable

        int number = 5;
        System.out.println(String.format("%-010d", number)); // Mutant: FormatString with renamed variable

        char character = 'c';
        System.out.println(String.format("%.c", character)); // Mutant: FormatString with renamed variable

        String lineSeparator = System.lineSeparator();
        System.out.println(String.format("%1n", lineSeparator)); // Mutant: FormatString with renamed variable

        String testString = "test";
        System.out.println(String.format("%<s", testString)); // Mutant: FormatString with renamed variable

        String unknownConversion = "hello";
        System.out.println(String.format("%r", unknownConversion)); // Mutant: FormatString with renamed variable
    }
}