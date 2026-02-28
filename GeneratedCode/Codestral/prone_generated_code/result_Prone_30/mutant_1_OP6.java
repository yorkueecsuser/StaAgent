class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Mutant: Unreachable for loop
            System.out.println("Unreachable loop");
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