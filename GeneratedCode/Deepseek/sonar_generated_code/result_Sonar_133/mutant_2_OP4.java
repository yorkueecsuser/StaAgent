class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static double showBug() {
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Integer a = new Integer(1);
        Float b = new Float(2.0);
        
        // Adding a mutant
        boolean unreachableCondition = false; // mutant
        if (unreachableCondition) { // mutant
            return a.intValue(); // mutant
        } else { // mutant
            return b.floatValue(); // mutant
        } // mutant
    }
}