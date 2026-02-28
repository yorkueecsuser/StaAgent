class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            /* This block of code is unreachable */
        }
        return (Integer) obj; // This will always throw a ClassCastException
    }

    // Method to return a condition that is always false
    private static boolean getCondition() {
        return false;
    }
}