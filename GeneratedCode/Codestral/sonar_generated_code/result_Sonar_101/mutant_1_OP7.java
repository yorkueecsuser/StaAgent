class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        boolean condition = getCondition();
        if (!a || b) {
            result = 1;
            // Mutant code: Unreachable while loop
            while (condition) {
                System.out.println("This is an unreachable loop");
            }
        } else {
            result = 2;
        }
        return result;
    }

    // Method to dynamically determine the condition for the while loop
    private boolean getCondition() {
        return false;
    }
}