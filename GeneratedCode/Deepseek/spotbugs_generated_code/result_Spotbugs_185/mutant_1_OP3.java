class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        buggyField = 20;
    }

    public static int showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {  // Unreachable if branch
            int temp = buggyField;
            buggyField = temp + 1;  // This line will not be executed but may cause a compile-time error
        }
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }
}