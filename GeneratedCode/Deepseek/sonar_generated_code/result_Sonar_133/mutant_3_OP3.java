class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static double showBug() {
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Integer a = new Integer(1);
        Float b = new Float(2.0);
        boolean condition = false; // This is the mutation
        if (condition) { // This is the mutation
            return a.intValue(); // This is the mutation
        } else {
            return b.floatValue();
        }
    }
}