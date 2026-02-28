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
        boolean condition = getCondition(); // Non-final variable to ensure dynamic evaluation
        if (condition) {
            System.out.println("This branch is unreachable");
        } else {
            String result = showBug();
            System.out.println(result);
        }
    }
    
    // Method to simulate a dynamic condition. This method could be modified to change the condition.
    public static boolean getCondition() {
        return false; // This simulates an unreachable branch, but is dynamically evaluated
    }
}