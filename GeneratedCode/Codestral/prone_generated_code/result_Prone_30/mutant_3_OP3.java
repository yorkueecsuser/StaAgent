class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
        }
        // Inserted mutant code
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line should never be reached");
        }
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}