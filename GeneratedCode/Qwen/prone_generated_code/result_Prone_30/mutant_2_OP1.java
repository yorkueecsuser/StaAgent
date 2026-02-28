class DangerousLiteralNullExample {

    // Method that is null-hostile: passing a null literal to it is always wrong
    public String processString(String input) {
        String abcdabcd; // Dead Store mutation
        return input.toUpperCase(); // This will throw a NullPointerException if input is null
    }

    // Method to demonstrate the bug
    public String showBug() {
        int efghijkl; // Dead Store mutation
        return processString(null); // BUG: DangerousLiteralNull
    }

    public static void main(String[] args) {
        DangerousLiteralNullExample example = new DangerousLiteralNullExample();
        double mnopqrst; // Dead Store mutation
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}