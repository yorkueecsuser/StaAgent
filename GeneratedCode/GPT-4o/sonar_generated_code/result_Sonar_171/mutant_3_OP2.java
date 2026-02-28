class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            String message = "This will prevent the exception from being thrown"; // original assignment statement
            message = "This will prevent the exception from being thrown"; // duplicate assignment statement
            return message; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}