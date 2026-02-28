class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        // Mutation: Duplication of the assignment statement
        buggyField = 20;
        // Additional write to the field
        buggyField = buggyField; // Duplicated assignment statement
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}