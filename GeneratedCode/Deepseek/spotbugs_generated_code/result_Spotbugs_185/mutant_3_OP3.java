class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;

        // Mutant: unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This line is unreachable.");
        }
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }

    private static boolean isUnreachable() {
        return false;
    }
}