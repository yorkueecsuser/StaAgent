class DangerousLiteralNullBug {
    private static boolean getFalse() {
        return false;
    }

    private static void unsafeMethod(String input) {
        while (getFalse()) {  // Mutant: Inserted unreachable while loop
            System.out.println("This is an unreachable loop");
        }

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