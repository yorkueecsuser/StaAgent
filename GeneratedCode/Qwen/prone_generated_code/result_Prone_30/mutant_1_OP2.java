class DangerousLiteralNullExample {

    // Method that is null-hostile: passing a null literal to it is always wrong
    public String processString(String input) {
        return input.toUpperCase(); // This will throw a NullPointerException if input is null
    }

    // Method to demonstrate the bug
    public String showBug() {
        return processString(null); // BUG: DangerousLiteralNull
    }

    public static void main(String[] args) {
        DangerousLiteralNullExample example = new DangerousLiteralNullExample();
        String result = example.showBug(); // Introducing an assignment statement to duplicate
        String resultCopy = example.showBug(); // Duplicate of the assignment statement
        try {
            System.out.println(result);
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}