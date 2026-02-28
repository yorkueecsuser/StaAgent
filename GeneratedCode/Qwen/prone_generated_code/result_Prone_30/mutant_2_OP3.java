class DangerousLiteralNullExample {

    // Method that is null-hostile: passing a null literal to it is always wrong
    public String processString(String input) {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) { // Unreachable if statement
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        }
        return input.toUpperCase(); // This will throw a NullPointerException if input is null
    }

    // Method to demonstrate the bug
    public String showBug() {
        return processString(null); // BUG: DangerousLiteralNull
    }

    public static void main(String[] args) {
        DangerousLiteralNullExample example = new DangerousLiteralNullExample();
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // Method to provide a dynamically determined condition
    private boolean getCondition() {
        return false; // This method always returns false, making the if block unreachable
    }
}