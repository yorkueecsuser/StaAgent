class FormatStringBug {

    // Method to demonstrate duplicate flags in format specifier
    public String showBug1() {
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
    }

    // Mutated method with renamed variable
    public String showBug1a() {
        double a = Math.E;
        return String.format("e = %++10.4f", a); // BUG: FormatString
    }

    // Method to demonstrate incompatible conversion and flag
    public String showBug2() {
        return String.format("%#b", Math.E); // BUG: FormatString
    }

    // Mutated method with renamed variable
    public String showBug2b() {
        double b = Math.E;
        return String.format("%#b", b); // BUG: FormatString
    }

    // Method to demonstrate invalid Unicode code point
    public String showBug3() {
        return String.format("%c", 0x110000); // BUG: FormatString
    }

    // Mutated method with renamed variable
    public String showBug3c() {
        int c = 0x110000;
        return String.format("%c", c); // BUG: FormatString
    }

    // Method to demonstrate incompatible type for conversion
    public String showBug4() {
        return String.format("%f", "abcd"); // BUG: FormatString
    }

    // Mutated method with renamed variable
    public String showBug4d() {
        String d = "abcd";
        return String.format("%f", d); // BUG: FormatString
    }

    // Method to demonstrate illegal combination of flags
    public String showBug5() {
        return String.format("%-010d", 5); // BUG: FormatString
    }

    // Mutated method with renamed variable
    public String showBug5e() {
        int e = 5;
        return String.format("%-010d", e); // BUG: FormatString
    }

    // Method to demonstrate precision not supported by conversion
    public String showBug6() {
        return String.format("%.c", 'c'); // BUG: FormatString
    }

    // Mutated method with renamed variable
    public String showBug6f() {
        char f = 'c';
        return String.format("%.c", f); // BUG: FormatString
    }

    // Method to demonstrate width not supported by conversion
    public String showBug7() {
        return String.format("%1n"); // BUG: FormatString
    }

    // Method to demonstrate missing argument for format specifier
    public String showBug8() {
        return String.format("%<s", "test"); // BUG: FormatString
    }

    // Mutated method with renamed variable
    public String showBug8g() {
        String g = "test";
        return String.format("%<s", g); // BUG: FormatString
    }

    // Method to demonstrate missing width in format specifier
    public String showBug9() {
        return String.format("e = %-f", Math.E); // BUG: FormatString
    }

    // Mutated method with renamed variable
    public String showBug9h() {
        double h = Math.E;
        return String.format("e = %-f", h); // BUG: FormatString
    }

    // Method to demonstrate unknown conversion
    public String showBug10() {
        return String.format("%r", "hello"); // BUG: FormatString
    }

    // Mutated method with renamed variable
    public String showBug10i() {
        String i = "hello";
        return String.format("%r", i); // BUG: FormatString
    }
}