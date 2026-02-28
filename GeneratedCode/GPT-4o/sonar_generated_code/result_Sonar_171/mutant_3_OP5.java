class JumpStatementInFinallyBug {

    public static String showBug() {
        return doSomethingWhichThrowsException();
    }

    public static String doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            // Inserting an unreachable switch statement
            int unreachableSwitchValue = getUnreachableValue();
            switch (unreachableSwitchValue) {
                case 1:
                    System.out.println("This is case 1");
                    break;
                case 2:
                    System.out.println("This is case 2");
                    break;
                default:
                    System.out.println("This is the default case");
            }

            return "This will prevent the exception from being thrown"; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    // Method to dynamically return a value ensuring the switch remains unreachable
    public static int getUnreachableValue() {
        return 3; // This value is not matched by any switch case, making it unreachable
    }

    public static void main(String[] args) {
        String result = showBug();
        System.out.println(result);
    }
}