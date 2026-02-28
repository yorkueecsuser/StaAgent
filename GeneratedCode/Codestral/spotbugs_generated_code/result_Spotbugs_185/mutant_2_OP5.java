class NonFinalFieldBug {
    public static int buggyField;

    static {
        buggyField = 10;
        buggyField = 20;

        // Mutation: Insert an unreachable switch statement
        boolean condition = getCondition();
        if (!condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never be executed");
                    break;
            }
        }
    }

    public static int showBug() {
        return buggyField;
    }

    public static void main(String[] args) {
        System.out.println("Buggy field value: " + showBug());
    }

    // Dummy methods to avoid compile-time errors
    private static boolean getCondition() {
        return false;
    }

    private static int getValue() {
        return 0;
    }
}