class InefficientStringBuffering {
    public static String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));

        // MUTANT CODE: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will not be executed
            System.out.println("This is an unreachable loop!");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    // Method to dynamically determine the condition for the unreachable loop
    private static boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}