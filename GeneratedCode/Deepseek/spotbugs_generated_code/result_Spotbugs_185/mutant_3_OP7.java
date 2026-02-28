class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        // Added unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never be executed
            buggyField = 30;
        }
        buggyField = 20;
    }

    // Method to return a false condition for the unreachable loop
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}