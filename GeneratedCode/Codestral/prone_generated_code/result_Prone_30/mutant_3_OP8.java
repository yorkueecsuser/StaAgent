class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) { // BUG: DangerousLiteralNull - passing null will throw a NullPointerException
            System.out.println("Input is test");
        }
    }

    private static void unsafeMethodMutant(String i) { // Renaming Mutation: Renamed 'input' to 'i'
        if (i.equals("test")) {
            System.out.println("Input is test");
        }
    }

    public static void showBug() {
        unsafeMethod(null);
        unsafeMethodMutant(null); // Added this line to test the mutant
    }

    public static void main(String[] args) {
        showBug();
    }
}