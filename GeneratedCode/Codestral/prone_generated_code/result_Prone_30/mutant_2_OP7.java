class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
            while (getFalseCondition()) { // Mutant: Unreachable while loop
                // This code will never be executed
            }
        }
    }

    private static boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}