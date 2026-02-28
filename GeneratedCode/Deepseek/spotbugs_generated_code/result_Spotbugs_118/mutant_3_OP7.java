class BuggyCode {
    public boolean showBug(Object obj) {
        // Original code
        boolean result = obj instanceof String;

        // Mutant: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable loop.");
        }

        return result;
    }
}