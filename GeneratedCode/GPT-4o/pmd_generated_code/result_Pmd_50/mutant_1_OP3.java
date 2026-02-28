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

        // Mutation: Unreachable if statement
        boolean condition1 = getCondition(); // Introduce a method to simulate condition
        if (condition1) {
            LOGGER.error("Unreachable log in showBug1");
        }
    }

    public void showBug2() {
        // Incorrect number of arguments for the placeholder
        LOGGER.error("forget the arg %s"); // BUG: InvalidLogMessageFormat

        // Mutation: Unreachable if statement
        boolean condition2 = getCondition(); // Introduce a method to simulate condition
        if (condition2) {
            LOGGER.error("Unreachable log in showBug2");
        }
    }

    public void showBug3() {
        // Too many arguments provided for placeholders
        LOGGER.error("too many args {}", "arg1", "arg2"); // BUG: InvalidLogMessageFormat

        // Mutation: Unreachable if statement
        boolean condition3 = getCondition(); // Introduce a method to simulate condition
        if (condition3) {
            LOGGER.error("Unreachable log in showBug3");
        }
    }

    public void showBug4() {
        // Exception is shown separately, so this is correct usage
        LOGGER.error("param {}", "arg1", new IllegalStateException("arg"));

        // Mutation: Unreachable if statement
        boolean condition4 = getCondition(); // Introduce a method to simulate condition
        if (condition4) {
            LOGGER.error("Unreachable log in showBug4");
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

    // Helper method to simulate dynamic condition for unreachable code
    private boolean getCondition() {
        return false;
    }
}