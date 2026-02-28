class FormatStringBug {

    // Method to demonstrate duplicate flags in format specifier
    public String showBug1() {
        String qwejklmn; // Dead Store
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate incompatible conversion and flag
    public String showBug2() {
        int abcdefgh; // Dead Store
        return String.format("%#b", Math.E); // BUG: FormatString
    }

    // Method to demonstrate invalid Unicode code point
    public String showBug3() {
        boolean hijklmno; // Dead Store
        return String.format("%c", 0x110000); // BUG: FormatString
    }

    // Method to demonstrate incompatible type for conversion
    public String showBug4() {
        double pqrsutvw; // Dead Store
        return String.format("%f", "abcd"); // BUG: FormatString
    }

    // Method to demonstrate illegal combination of flags
    public String showBug5() {
        char xyzabcde; // Dead Store
        return String.format("%-010d", 5); // BUG: FormatString
    }

    // Method to demonstrate precision not supported by conversion
    public String showBug6() {
        float fghijklm; // Dead Store
        return String.format("%.c", 'c'); // BUG: FormatString
    }

    // Method to demonstrate width not supported by conversion
    public String showBug7() {
        long opqrstuv; // Dead Store
        return String.format("%1n"); // BUG: FormatString
    }

    // Method to demonstrate missing argument for format specifier
    public String showBug8() {
        short tuvwxyza; // Dead Store
        return String.format("%<s", "test"); // BUG: FormatString
    }

    // Method to demonstrate missing width in format specifier
    public String showBug9() {
        byte bcdefghi; // Dead Store
        return String.format("e = %-f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate unknown conversion
    public String showBug10() {
        int jklmnopq; // Dead Store
        return String.format("%r", "hello"); // BUG: FormatString
    }
}