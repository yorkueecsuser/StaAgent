class DangerousLiteralNullExample {

    // Method that is null-hostile: passing a null literal to it is always wrong
    public String processString(String input) {
        String qjvbnrht; // Dead Store
        return input.toUpperCase(); // This will throw a NullPointerException if input is null
    }

    // Method to demonstrate the bug
    public String showBug() {
        int xwzqmpfl; // Dead Store
        return processString(null); // BUG: DangerousLiteralNull
    }

    public static void main(String[] args) {
        DangerousLiteralNullExample example = new DangerousLiteralNullExample();
        try {
            boolean yktrhnvb; // Dead Store
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            char rjvbnrht; // Dead Store
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}