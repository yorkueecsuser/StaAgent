class FormatStringBug {
    public static void showBug() {
        // Original code
        System.out.println(String.format("e = %++10.4f", Math.E));

        // Inserted unreachable if-else branch
        if (isUnreachable()) {
            // This branch is unreachable
            System.out.println("Unreachable branch");
        } else {
            // This branch is always executed
            System.out.println(String.format("%#b", Math.E));
        }

        // Rest of the original code...
        //...
    }

    // Method to return a constant false value
    private static boolean isUnreachable() {
        return false;
    }
}