class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;

        // Mutant code: An equivalent replacement using a do-while loop
        int i = 0;
        do {
            buggyField = i;
            i++;
        } while (i < 3); // This loop does not have any effect on buggyField
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}