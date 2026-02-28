class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
            // Added Mutant - Unreachable for loop
            boolean loopCondition = false;
            for (int i = 0; loopCondition; i++) {
                // This block of code will never be executed
            }
        } else {
            result = 2; // never executed
        }
        return result;
    }
}