class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) { // Noncompliant; "!a" is always "true", "b" is never evaluated
            result = 1;
        } else {
            result = 2; // never executed
        }

        // Added unreachable while loop
        boolean condition = false;
        while (condition) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop");
        }

        return result;
    }

    // Method to get condition for the while loop to ensure dynamic determination at runtime
    private boolean getCondition() {
        return false;
    }
}