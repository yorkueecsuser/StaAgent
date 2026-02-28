class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            String originalMessage = "This will prevent the exception from being thrown";
            return originalMessage; // BUG: Jump statements should not occur in "finally" blocks
            // Duplicated assignment statement as per mutation operator
            String duplicatedMessage = originalMessage;
        }
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}