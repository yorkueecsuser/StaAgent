class FormatStringBug {

    // Method to demonstrate duplicate flags in format specifier
    public String showBug1() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate incompatible conversion and flag
    public String showBug2() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("%#b", Math.E); // BUG: FormatString
    }

    // Method to demonstrate invalid Unicode code point
    public String showBug3() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("%c", 0x110000); // BUG: FormatString
    }

    // Method to demonstrate incompatible type for conversion
    public String showBug4() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("%f", "abcd"); // BUG: FormatString
    }

    // Method to demonstrate illegal combination of flags
    public String showBug5() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("%-010d", 5); // BUG: FormatString
    }

    // Method to demonstrate precision not supported by conversion
    public String showBug6() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("%.c", 'c'); // BUG: FormatString
    }

    // Method to demonstrate width not supported by conversion
    public String showBug7() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("%1n"); // BUG: FormatString
    }

    // Method to demonstrate missing argument for format specifier
    public String showBug8() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("%<s", "test"); // BUG: FormatString
    }

    // Method to demonstrate missing width in format specifier
    public String showBug9() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("e = %-f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate unknown conversion
    public String showBug10() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return String.format("%r", "hello"); // BUG: FormatString
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }
}