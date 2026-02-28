class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
        } else {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) { // Unreachable if-else statement
                System.out.println("This code should never be executed");
            }
        }
    }

    // Method to simulate a dynamic condition that always returns false for unreachable code
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}