class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static double showBug() {
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Integer x = new Integer(1);
        Float y = new Float(2.0);
        return x.intValue() > y.floatValue()? x.intValue() : y.floatValue(); // Mutated Bug
    }
}