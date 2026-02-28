class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        String renamedInput = input; // Mutant: Renamed the variable 'input' to'renamedInput'
        if (renamedInput.equals("test")) {
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