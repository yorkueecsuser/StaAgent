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

        // Unreachable switch statement mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999: // This case will never be hit
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case that does nothing
                break;
        }
    }

    public void showBug2() {
        // Incorrect number of arguments for the placeholder
        LOGGER.error("forget the arg %s"); // BUG: InvalidLogMessageFormat

        // Unreachable switch statement mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 8888: // This case will never be hit
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case that does nothing
                break;
        }
    }

    public void showBug3() {
        // Too many arguments provided for placeholders
        LOGGER.error("too many args {}", "arg1", "arg2"); // BUG: InvalidLogMessageFormat

        // Unreachable switch statement mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 7777: // This case will never be hit
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case that does nothing
                break;
        }
    }

    public void showBug4() {
        // Exception is shown separately, so this is correct usage
        LOGGER.error("param {}", "arg1", new IllegalStateException("arg"));

        // Unreachable switch statement mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 6666: // This case will never be hit
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case that does nothing
                break;
        }
    }

    private int getUnreachableValue() {
        // Returns a value that will never hit the switch cases
        return -1; // Ensure this is not a case in any switch
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
}