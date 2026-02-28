class FormatStringBug {

    // Method to demonstrate duplicate flags in format specifier
    public String showBug1() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("e = %++10.4f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate incompatible conversion and flag
    public String showBug2() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("%#b", Math.E); // BUG: FormatString
    }

    // Method to demonstrate invalid Unicode code point
    public String showBug3() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("%c", 0x110000); // BUG: FormatString
    }

    // Method to demonstrate incompatible type for conversion
    public String showBug4() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("%f", "abcd"); // BUG: FormatString
    }

    // Method to demonstrate illegal combination of flags
    public String showBug5() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("%-010d", 5); // BUG: FormatString
    }

    // Method to demonstrate precision not supported by conversion
    public String showBug6() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("%.c", 'c'); // BUG: FormatString
    }

    // Method to demonstrate width not supported by conversion
    public String showBug7() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("%1n"); // BUG: FormatString
    }

    // Method to demonstrate missing argument for format specifier
    public String showBug8() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("%<s", "test"); // BUG: FormatString
    }

    // Method to demonstrate missing width in format specifier
    public String showBug9() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("e = %-f", Math.E); // BUG: FormatString
    }

    // Method to demonstrate unknown conversion
    public String showBug10() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code");
        }
        return String.format("%r", "hello"); // BUG: FormatString
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }
}