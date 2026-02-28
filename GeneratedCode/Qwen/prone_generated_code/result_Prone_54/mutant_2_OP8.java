class FormatStringBug {

    // Method to demonstrate duplicate flags in format specifier
    public String showBug1() {
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate duplicate flags in format specifier
    public String x(String y) {
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate incompatible conversion and flag
    public String showBug2() {
        return String.format("%#b", Math.E); // BUG: FormatString
    }

    // Method to demonstrate incompatible conversion and flag
    public String z(String a) {
        return String.format("%#b", Math.E); // BUG: FormatString
    }

    // Method to demonstrate invalid Unicode code point
    public String showBug3() {
        return String.format("%c", 0x110000); // BUG: FormatString
    }

    // Method to demonstrate invalid Unicode code point
    public String b(String c) {
        return String.format("%c", 0x110000); // BUG: FormatString
    }

    // Method to demonstrate incompatible type for conversion
    public String showBug4() {
        return String.format("%f", "abcd"); // BUG: FormatString
    }

    // Method to demonstrate incompatible type for conversion
    public String d(String e) {
        return String.format("%f", "abcd"); // BUG: FormatString
    }

    // Method to demonstrate illegal combination of flags
    public String showBug5() {
        return String.format("%-010d", 5); // BUG: FormatString
    }

    // Method to demonstrate illegal combination of flags
    public String f(String g) {
        return String.format("%-010d", 5); // BUG: FormatString
    }

    // Method to demonstrate precision not supported by conversion
    public String showBug6() {
        return String.format("%.c", 'c'); // BUG: FormatString
    }

    // Method to demonstrate precision not supported by conversion
    public String h(String i) {
        return String.format("%.c", 'c'); // BUG: FormatString
    }

    // Method to demonstrate width not supported by conversion
    public String showBug7() {
        return String.format("%1n"); // BUG: FormatString
    }

    // Method to demonstrate width not supported by conversion
    public String j(String k) {
        return String.format("%1n"); // BUG: FormatString
    }

    // Method to demonstrate missing argument for format specifier
    public String showBug8() {
        return String.format("%<s", "test"); // BUG: FormatString
    }

    // Method to demonstrate missing argument for format specifier
    public String l(String m) {
        return String.format("%<s", "test"); // BUG: FormatString
    }

    // Method to demonstrate missing width in format specifier
    public String showBug9() {
        return String.format("e = %-f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate missing width in format specifier
    public String n(String o) {
        return String.format("e = %-f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate unknown conversion
    public String showBug10() {
        return String.format("%r", "hello"); // BUG: FormatString
    }

    // Method to demonstrate unknown conversion
    public String p(String q) {
        return String.format("%r", "hello"); // BUG: FormatString
    }
}