class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        String message = "This will prevent the exception from being thrown";
        // Mutation: Duplicate the assignment statement
        message = "This will prevent the exception from being thrown";
        try {
            throw new RuntimeException();
        } finally {
            return message; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}