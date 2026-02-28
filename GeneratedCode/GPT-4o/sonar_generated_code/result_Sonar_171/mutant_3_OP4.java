class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Unreachable if-else statement added
            boolean condition = getCondition(); // Using a method to ensure dynamic condition
            if (condition) {
                System.out.println("This block will not execute.");
            } else {
                System.out.println("Neither will this.");
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Method to provide a dynamic condition, ensuring the if-else block is unreachable
    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}