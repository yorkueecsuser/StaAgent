class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;

        // Unreachable if statement
        if (isFalseCondition()) {
            buggyField = 30;
        }
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }

    private static boolean isFalseCondition() {
        return false;
    }
}