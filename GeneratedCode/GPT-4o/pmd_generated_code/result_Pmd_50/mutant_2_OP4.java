class LoggingExample {
    // Simulated Logger class to mimic the behavior of SLF4J for demonstration
    static class Logger {
        void error(String message, Object... args) {
            // This is just a placeholder for actual logging logic
            System.out.println(String.format(message, args));
        }
    }

    private static final Logger LOGGER = new Logger();

    public void showBug1() {
        // Incorrect number of arguments for the placeholder
        LOGGER.error("forget the arg {}"); // BUG: InvalidLogMessageFormat
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable if-else added in showBug1.");
        }
    }

    public void showBug2() {
        // Incorrect number of arguments for the placeholder
        LOGGER.error("forget the arg %s"); // BUG: InvalidLogMessageFormat
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable if-else added in showBug2.");
        }
    }

    public void showBug3() {
        // Too many arguments provided for placeholders
        LOGGER.error("too many args {}", "arg1", "arg2"); // BUG: InvalidLogMessageFormat
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable if-else added in showBug3.");
        }
    }

    public void showBug4() {
        // Exception is shown separately, so this is correct usage
        LOGGER.error("param {}", "arg1", new IllegalStateException("arg"));
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable if-else added in showBug4.");
        }
    }

    public static void main(String[] args) {
        LoggingExample example = new LoggingExample();
        example.showBug1();
        example.showBug2();
        example.showBug3();
        example.showBug4();
    }

    public void showBug() {
        this.showBug1();
        this.showBug2();
        this.showBug3();
        this.showBug4();
    }
    
    // Helper method to provide a condition for unreachable if-else
    private boolean getFalseCondition() {
        return false;
    }
}