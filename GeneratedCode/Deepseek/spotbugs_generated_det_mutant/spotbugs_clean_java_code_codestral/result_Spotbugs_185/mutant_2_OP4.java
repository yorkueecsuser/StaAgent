class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        // Additional write to the field
        buggyField = 20;
        // Mutant code added here
        boolean unreachableCondition = isUnreachableConditionMet();
        if (unreachableCondition) {
            // This branch is unreachable because isUnreachableConditionMet always returns false
            buggyField = 30;
        } else {
            // This branch is reachable
            buggyField = 40;
        }
    }

    public static boolean isUnreachableConditionMet() {
        // This always returns false to make the if branch unreachable
        return false;
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}