class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
        }
    }

    public static void showBug() {
        unsafeMethod(null);
        unsafeMethod(null); // Mutant: Duplication of the line above
    }

    public static void main(String[] args) {
        showBug();
    }
}