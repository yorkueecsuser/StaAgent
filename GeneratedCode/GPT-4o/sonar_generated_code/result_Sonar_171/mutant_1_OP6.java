class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Unreachable for loop inserted here
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This loop is unreachable");
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Method to ensure the loop condition is not a compile-time constant
    public static boolean getCondition() {
        return false; // Making condition false but not as a compile-time constant
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}