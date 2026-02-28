class DangerousLiteralNullBug {
    private static boolean getFalse() {
        return false;
    }

    private static void unsafeMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
        }
        if (getFalse()) { // Mutant: Unreachable if statement
            System.out.println("This statement is unreachable");
        }
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}