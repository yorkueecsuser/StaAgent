class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static double showBug() {
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Integer a = new Integer(1);
        Float b = new Float(2.0);
        // Mutant Code
        boolean mutantCondition = false;
        // Mutant condition is always false to make it unreachable
        if (!mutantCondition) {
            for(int i = 0; i < 10; i++) {
                // Non-reachable code
                System.out.println("This code is non-reachable.");
            }
        }
        // End of mutant code
        return a.intValue() > b.floatValue()? a.intValue() : b.floatValue(); // Bug
    }
}