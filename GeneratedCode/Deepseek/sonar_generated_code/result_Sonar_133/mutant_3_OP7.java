class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static double showBug() {
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Integer a = new Integer(1);
        Float b = new Float(2.0);
        boolean conditionWhile = false;
        if (conditionWhile) {
            while (conditionWhile) {
                // Placeholder for a statement that is unreachable due to the above condition
            }
        }
        return a.intValue() > b.floatValue()? a.intValue() : b.floatValue(); // Bug
    }
}