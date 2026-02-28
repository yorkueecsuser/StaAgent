class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        // Additional write to the field
        buggyField = 20;
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }

    private static boolean getCondition() {
        return false;
    }
}