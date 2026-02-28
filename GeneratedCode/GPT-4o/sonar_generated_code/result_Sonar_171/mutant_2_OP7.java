class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Adding an unreachable while loop
            boolean condition = getFalseCondition();
            while (condition) {
                System.out.println("This is unreachable code");
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Helper method to ensure the condition is dynamically determined
    public static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}