class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) { // BUG: DangerousLiteralNull - passing null will throw a NullPointerException
            System.out.println("Input is test");
        }
        // Mutant code: duplication of the comparison statement
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