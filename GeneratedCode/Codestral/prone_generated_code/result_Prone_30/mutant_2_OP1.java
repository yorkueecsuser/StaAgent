class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        String deadStoreVar = "uselessVar"; // Dead Store mutant
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