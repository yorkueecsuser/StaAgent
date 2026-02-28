class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        // Unreachable while loop added as per mutation operator
        boolean conditionWhile = getWhileCondition();
        while (conditionWhile) {
            // This code block is unreachable
            System.out.println("This is an unreachable while loop.");
        }
        
        try {
            throw new RuntimeException();
        } finally {
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Method to ensure the condition is not a compile-time constant
    private static boolean getWhileCondition() {
        return false;
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}