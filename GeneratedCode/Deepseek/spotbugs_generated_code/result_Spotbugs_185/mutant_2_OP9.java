class NonFinalFieldBug {
    public static int buggyField;

    static {
        int tempField = 10;
        // Equivalent Loop Replacement: Replacing the second write to the field with a do-while loop
        do {
            tempField = 20;
        } while (false);
        buggyField = tempField;
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}