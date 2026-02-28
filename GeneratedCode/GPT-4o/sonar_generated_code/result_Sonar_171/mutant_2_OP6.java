class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Insert an unreachable for loop with condition dynamically determined at runtime
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This block is unreachable due to the condition
                System.out.println("This loop is unreachable");
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Method to dynamically determine the for loop condition
    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}