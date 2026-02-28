class DangerousLiteralNullBug {
    private static boolean getFalseCondition() {
        return false;
    }

    private static void unsafeMethod(String input) {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop");
        }

        if (input.equals("test")) {
            System.out.println("Input is test");
        }
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}