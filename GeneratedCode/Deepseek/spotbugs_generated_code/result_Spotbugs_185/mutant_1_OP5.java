class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;

        // Mutant: Unreachable if-else statement
        boolean shouldChange = getCondition();
        if (shouldChange) {
            buggyField = 30;
        } else {
            buggyField = 40;
        }
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }

    // This method returns a condition that is always false to make the if-else statement unreachable
    private static boolean getCondition() {
        return false;
    }
}