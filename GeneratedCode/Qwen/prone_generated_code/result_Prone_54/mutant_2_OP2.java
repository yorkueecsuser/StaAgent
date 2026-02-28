class FormatStringBug {

    // Method to demonstrate duplicate flags in format specifier
    public String showBug1() {
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
        String temp1 = "e = %++10.4f"; // Mutation: Duplicate assignment
        return String.format(temp1, Math.E);
    }

    // Method to demonstrate incompatible conversion and flag
    public String showBug2() {
        return String.format("%#b", Math.E); // BUG: FormatString
        String temp2 = "%#b"; // Mutation: Duplicate assignment
        return String.format(temp2, Math.E);
    }

    // Method to demonstrate invalid Unicode code point
    public String showBug3() {
        return String.format("%c", 0x110000); // BUG: FormatString
        char temp3 = (char) 0x110000; // Mutation: Duplicate assignment
        return String.format("%c", temp3);
    }

    // Method to demonstrate incompatible type for conversion
    public String showBug4() {
        return String.format("%f", "abcd"); // BUG: FormatString
        String temp4 = "abcd"; // Mutation: Duplicate assignment
        return String.format("%f", temp4);
    }

    // Method to demonstrate illegal combination of flags
    public String showBug5() {
        return String.format("%-010d", 5); // BUG: FormatString
        int temp5 = 5; // Mutation: Duplicate assignment
        return String.format("%-010d", temp5);
    }

    // Method to demonstrate precision not supported by conversion
    public String showBug6() {
        return String.format("%.c", 'c'); // BUG: FormatString
        char temp6 = 'c'; // Mutation: Duplicate assignment
        return String.format("%.c", temp6);
    }

    // Method to demonstrate width not supported by conversion
    public String showBug7() {
        return String.format("%1n"); // BUG: FormatString
        String temp7 = "%1n"; // Mutation: Duplicate assignment
        return String.format(temp7);
    }

    // Method to demonstrate missing argument for format specifier
    public String showBug8() {
        return String.format("%<s", "test"); // BUG: FormatString
        String temp8 = "test"; // Mutation: Duplicate assignment
        return String.format("%<s", temp8);
    }

    // Method to demonstrate missing width in format specifier
    public String showBug9() {
        return String.format("e = %-f", Math.E); // BUG: FormatString
        double temp9 = Math.E; // Mutation: Duplicate assignment
        return String.format("e = %-f", temp9);
    }

    // Method to demonstrate unknown conversion
    public String showBug10() {
        return String.format("%r", "hello"); // BUG: FormatString
        String temp10 = "hello"; // Mutation: Duplicate assignment
        return String.format("%r", temp10);
    }
}