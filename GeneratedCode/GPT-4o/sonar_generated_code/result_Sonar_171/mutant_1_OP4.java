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
        
        // Mutation: Unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This is the else branch");
        }
    }
    
    // This method provides a condition that always returns false
    public static boolean getUnreachableCondition() {
        return false;
    }
}