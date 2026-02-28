class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);

        // Mutation: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable due to condition always being false.");
        }
    }

    // Method to ensure unreachable if statement compiles successfully
    public static boolean getCondition() {
        return false;
    }
}