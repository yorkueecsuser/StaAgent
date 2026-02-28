class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        buggyField = 20;

        // Mutant Code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            buggyField = 30;
        } else {
            System.out.println("Unreachable code block executed");
        }
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}