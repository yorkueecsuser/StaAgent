class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        boolean condition = getCondition();
        // Adding unreachable for loop
        for (int i = 0; condition; i++) {
            System.out.println("This code will never be executed");
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

    // Dummy method to avoid compile-time error
    private static boolean getCondition() {
        return false;
    }
}