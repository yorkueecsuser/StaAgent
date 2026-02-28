class NonFinalFieldBug {
    public static int buggyField;
    // Mutation: Dead Store
    private static int deadStoreVariable;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;
        // Mutation: Dead Store
        deadStoreVariable = 30; // Unused variable
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}