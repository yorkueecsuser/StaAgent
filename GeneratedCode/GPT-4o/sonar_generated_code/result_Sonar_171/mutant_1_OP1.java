class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            String zvbqwdas = "Dead store variable"; // Dead store: unused variable declaration
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}