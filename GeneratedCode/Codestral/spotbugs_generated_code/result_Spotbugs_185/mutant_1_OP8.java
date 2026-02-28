class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;
    }

    public static int showBug() {
        // Renaming a non-buggy variable
        int tempField = buggyField;
        return tempField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}