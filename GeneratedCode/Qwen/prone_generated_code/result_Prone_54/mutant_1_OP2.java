class FormatStringBug {

    // Method to demonstrate duplicate flags in format specifier
    public String showBug1() {
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
        String bug1 = "e = %++10.4f"; // Mutant: Duplicate assignment
        return String.format(bug1, Math.E);
    }

    // Method to demonstrate incompatible conversion and flag
    public String showBug2() {
        return String.format("%#b", Math.E); // BUG: FormatString
        String bug2 = "%#b"; // Mutant: Duplicate assignment
        return String.format(bug2, Math.E);
    }

    // Method to demonstrate invalid Unicode code point
    public String showBug3() {
        return String.format("%c", 0x110000); // BUG: FormatString
        int invalidUnicode = 0x110000; // Mutant: Duplicate assignment
        return String.format("%c", invalidUnicode);
    }

    // Method to demonstrate incompatible type for conversion
    public String showBug4() {
        return String.format("%f", "abcd"); // BUG: FormatString
        String incompatibleType = "%f"; // Mutant: Duplicate assignment
        return String.format(incompatibleType, "abcd");
    }

    // Method to demonstrate illegal combination of flags
    public String showBug5() {
        return String.format("%-010d", 5); // BUG: FormatString
        String illegalFlags = "%-010d"; // Mutant: Duplicate assignment
        return String.format(illegalFlags, 5);
    }

    // Method to demonstrate precision not supported by conversion
    public String showBug6() {
        return String.format("%.c", 'c'); // BUG: FormatString
        String precisionNotSupported = "%.c"; // Mutant: Duplicate assignment
        return String.format(precisionNotSupported, 'c');
    }

    // Method to demonstrate width not supported by conversion
    public String showBug7() {
        return String.format("%1n"); // BUG: FormatString
        String widthNotSupported = "%1n"; // Mutant: Duplicate assignment
        return String.format(widthNotSupported);
    }

    // Method to demonstrate missing argument for format specifier
    public String showBug8() {
        return String.format("%<s", "test"); // BUG: FormatString
        String missingArgument = "%<s"; // Mutant: Duplicate assignment
        return String.format(missingArgument, "test");
    }

    // Method to demonstrate missing width in format specifier
    public String showBug9() {
        return String.format("e = %-f", Math.E); // BUG: FormatString
        String missingWidth = "e = %-f"; // Mutant: Duplicate assignment
        return String.format(missingWidth, Math.E);
    }

    // Method to demonstrate unknown conversion
    public String showBug10() {
        return String.format("%r", "hello"); // BUG: FormatString
        String unknownConversion = "%r"; // Mutant: Duplicate assignment
        return String.format(unknownConversion, "hello");
    }
}