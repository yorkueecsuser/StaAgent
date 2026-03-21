class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        // Duplicate assignment to the field
        buggyField = 20;
        // Duplicated assignment statement
        buggyField = 20;
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}