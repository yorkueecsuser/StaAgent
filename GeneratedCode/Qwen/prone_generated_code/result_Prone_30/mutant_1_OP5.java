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
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is the reachable case.");
                break;
        }
    }

    // Method to provide a dynamic condition
    private static boolean getCondition() {
        return false; // This method always returns false, making the switch condition dynamically determined
    }
}