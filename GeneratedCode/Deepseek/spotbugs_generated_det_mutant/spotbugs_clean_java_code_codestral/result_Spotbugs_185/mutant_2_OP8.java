class NonFinalFieldBug {
    // Original code with the bug
    public static int buggyField;
    // Mutated code with a renamed variable
    public static int renamedField;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;
        // Renaming the variable in the static initializer
        renamedField = buggyField;
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
        // Using the renamed variable
        System.out.println("Renamed field value: " + renamedField);
    }
}