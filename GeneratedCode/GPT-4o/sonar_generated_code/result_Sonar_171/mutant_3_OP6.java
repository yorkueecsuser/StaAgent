class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Introducing an unreachable for loop
            boolean conditionFor = getCondition(); // This should always return false
            for (int i = 0; conditionFor; i++) {
                System.out.println("This code will never execute.");
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Method to simulate a runtime condition for unreachable code
    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}