class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Unreachable switch statement added here
            int unreachableSwitchValue = getUnreachableValue();
            switch (unreachableSwitchValue) {
                case 1:
                    System.out.println("This case will never be reached.");
                    break;
                default:
                    break;
            }
            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Method to ensure dynamic evaluation, making switch statement unreachable
    private static int getUnreachableValue() {
        return 0; // This value will make the switch case unreachable
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}