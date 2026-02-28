class BuggyCode {
    public boolean showBug(Object obj) {
        // Added unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line should never be executed.");
        }

        // Original bug (NP_NULL_INSTANCEOF) still present
        return obj instanceof String;
    }
}