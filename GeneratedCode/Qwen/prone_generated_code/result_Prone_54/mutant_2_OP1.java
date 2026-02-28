class FormatStringBug {

    // Method to demonstrate duplicate flags in format specifier
    public String showBug1() {
        String qjvhtyfn = "unused"; // Dead Store
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate incompatible conversion and flag
    public String showBug2() {
        int xkzvbnmr = 42; // Dead Store
        return String.format("%#b", Math.E); // BUG: FormatString
    }

    // Method to demonstrate invalid Unicode code point
    public String showBug3() {
        double wqejrhty = 3.14; // Dead Store
        return String.format("%c", 0x110000); // BUG: FormatString
    }

    // Method to demonstrate incompatible type for conversion
    public String showBug4() {
        char vbnrhtye = 'a'; // Dead Store
        return String.format("%f", "abcd"); // BUG: FormatString
    }

    // Method to demonstrate illegal combination of flags
    public String showBug5() {
        boolean zvbnrhty = true; // Dead Store
        return String.format("%-010d", 5); // BUG: FormatString
    }

    // Method to demonstrate precision not supported by conversion
    public String showBug6() {
        long lqejrhty = 123456789; // Dead Store
        return String.format("%.c", 'c'); // BUG: FormatString
    }

    // Method to demonstrate width not supported by conversion
    public String showBug7() {
        float jqejrhty = 2.718f; // Dead Store
        return String.format("%1n"); // BUG: FormatString
    }

    // Method to demonstrate missing argument for format specifier
    public String showBug8() {
        short sqejrhty = 10; // Dead Store
        return String.format("%<s", "test"); // BUG: FormatString
    }

    // Method to demonstrate missing width in format specifier
    public String showBug9() {
        byte bqejrhty = 8; // Dead Store
        return String.format("e = %-f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate unknown conversion
    public String showBug10() {
        Object oqejrhty = new Object(); // Dead Store
        return String.format("%r", "hello"); // BUG: FormatString
    }
}