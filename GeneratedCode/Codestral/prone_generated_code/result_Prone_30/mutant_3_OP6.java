class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) { // BUG: DangerousLiteralNull - passing null will throw a NullPointerException
            System.out.println("Input is test");
        }

        // Mutant: Unreachable for loop
        boolean loopCondition = getCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This line is unreachable");
        }
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }

    private static boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }
}