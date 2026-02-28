class FormatStringBug {
    public static void showBug() {
        // Original code statements
        //...

        // Mutant code: Unreachable if statement
        if (isUnreachable()) {
            int x = 10;
            System.out.println("Unreachable code: " + x);
        }
    }

    // Method to simulate the unreachable condition
    private static boolean isUnreachable() {
        return false;
    }
}