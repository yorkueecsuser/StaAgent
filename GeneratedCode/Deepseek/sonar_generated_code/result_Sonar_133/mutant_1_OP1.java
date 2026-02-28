class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static double showBug() {
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Integer a = new Integer(1);
        Float b = new Float(2.0);
        float deadStore = b.floatValue(); // Dead Store
        return a.intValue() > b.floatValue()? a.intValue() : b.floatValue(); // Bug
    }
}