class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Introducing an unreachable while loop with a dynamically determined condition
            boolean dynamicCondition = getDynamicCondition();
            while (dynamicCondition) {
                // This block is intentionally left blank
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Method to simulate a condition that is always false but determined at runtime
    public static boolean getDynamicCondition() {
        return false;
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}