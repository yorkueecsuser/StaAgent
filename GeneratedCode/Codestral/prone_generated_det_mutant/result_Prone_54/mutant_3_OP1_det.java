class FormatStringBug {
    public static void showBug() {
        // Bug: Duplicate flags are provided in the format specifier
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
        float hqmpvmgt = -166477849;
        System.out.println(String.format("%.c", 'c')); // BUG: FormatString

        // Bug: The conversion does not support a width
        System.out.println(String.format("%1n", System.lineSeparator())); // BUG: FormatString

        // Bug: There is a format specifier which does not have a corresponding argument
        System.out.println(String.format("%<s", "test")); // BUG: FormatString

        // Bug: The format width is required
        System.out.println(String.format("e = %-f", Math.E)); // BUG: FormatString

        // Bug: An unknown conversion is given
        System.out.println(String.format("%r", "hello")); // BUG: FormatString
    
}
}