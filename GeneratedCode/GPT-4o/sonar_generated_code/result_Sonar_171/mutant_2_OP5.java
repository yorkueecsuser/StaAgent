class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Inserting unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This will never print.");
                    break;
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    private static int getUnreachableValue() {
        return -1; // This value ensures that the switch statement case is never matched
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}