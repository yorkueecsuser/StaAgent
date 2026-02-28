class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static double showBug() {
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Integer a = new Integer(1);
        Float b = new Float(2.0);
        return a.intValue() > b.floatValue()? a.intValue() : b.floatValue(); // Bug

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; false; i++) { 
            // Unreachable code added to avoid unreachable statement error
            int x = 10;
        }
    }

    // Method to get a non-final condition for mutation
    public static boolean getCondition() {
        return false;
    }
}