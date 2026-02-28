class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;

        // Mutant code: Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This loop is unreachable, so the code inside will never execute
            buggyField = 30;
        }

        buggyField = 20;
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}