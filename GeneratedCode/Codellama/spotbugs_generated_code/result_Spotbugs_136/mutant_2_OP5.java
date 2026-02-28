class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
    public static void main(String[] args) {
        int x = 5;
        boolean y = true;
        if (x == 5) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            y = false;
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static boolean showBug() {
        int x = 5;
        boolean y = true;
        if (x == 5) {
            y = false;
        }
        return y;
    }

    // Unreachable switch statement mutation
    public static void switchStatementMutation() {
        int x = 5;
        boolean y = true;
        if (x == 5) {
            y = false;
        }
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("x: " + x);
                System.out.println("y: " + y);
                break;
            default:
                System.out.println("This is an unreachable branch");
                break;
        }
    }

    // Helper method to get a value
    public static int getValue() {
        return 0;
    }
}