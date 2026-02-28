class FormatStringBug {

    // Method to demonstrate duplicate flags in format specifier
    public String showBug1() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug1");
        }
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate incompatible conversion and flag
    public String showBug2() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug2");
        }
        return String.format("%#b", Math.E); // BUG: FormatString
    }

    // Method to demonstrate invalid Unicode code point
    public String showBug3() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug3");
        }
        return String.format("%c", 0x110000); // BUG: FormatString
    }

    // Method to demonstrate incompatible type for conversion
    public String showBug4() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug4");
        }
        return String.format("%f", "abcd"); // BUG: FormatString
    }

    // Method to demonstrate illegal combination of flags
    public String showBug5() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug5");
        }
        return String.format("%-010d", 5); // BUG: FormatString
    }

    // Method to demonstrate precision not supported by conversion
    public String showBug6() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug6");
        }
        return String.format("%.c", 'c'); // BUG: FormatString
    }

    // Method to demonstrate width not supported by conversion
    public String showBug7() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug7");
        }
        return String.format("%1n"); // BUG: FormatString
    }

    // Method to demonstrate missing argument for format specifier
    public String showBug8() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug8");
        }
        return String.format("%<s", "test"); // BUG: FormatString
    }

    // Method to demonstrate missing width in format specifier
    public String showBug9() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug9");
        }
        return String.format("e = %-f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate unknown conversion
    public String showBug10() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            System.out.println("This is an unreachable block in showBug10");
        }
        return String.format("%r", "hello"); // BUG: FormatString
    }

    // Helper method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}