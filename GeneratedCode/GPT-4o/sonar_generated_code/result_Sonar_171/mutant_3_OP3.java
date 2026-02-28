class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Unreachable if statement inserted here
            boolean condition = getCondition(); // This method simulates a dynamic condition
            if (condition) {
                System.out.println("This will never be printed");
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Simulates a runtime condition, returning false
    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}