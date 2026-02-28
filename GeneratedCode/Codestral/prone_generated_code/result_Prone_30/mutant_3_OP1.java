class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        // Adding dead store
        int unusedVariable = 10;

        if (input.equals("test")) { // BUG: DangerousLiteralNull - passing null will throw a NullPointerException
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