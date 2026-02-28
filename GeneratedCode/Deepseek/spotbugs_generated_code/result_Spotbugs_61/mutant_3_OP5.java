class NullParameterBug {
    private static boolean getFalse() {
        return false; // Method that always returns false
    }

    public static void printLength(String str) {
        System.out.println("Length: " + str.length());

        // Mutant: Unreachable switch statement
        int value = 0; // This will always be 0
        switch (value) {
            case 1:
                System.out.println("This line should not be reached.");
                break;
            default:
                break;
        }
    }

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}