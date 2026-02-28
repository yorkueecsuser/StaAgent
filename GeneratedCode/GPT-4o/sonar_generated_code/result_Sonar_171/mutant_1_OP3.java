class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Unreachable if statement mutation
            boolean condition = getCondition(); // Using a non-final variable to ensure it's not a compile-time constant
            if (condition) {
                System.out.println("This is an unreachable block.");
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Method to simulate a dynamic condition check
    public static boolean getCondition() {
        return false; // Always returns false for the mutation to be unreachable
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}