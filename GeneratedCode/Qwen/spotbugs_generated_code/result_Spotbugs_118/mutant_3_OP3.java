class NullInstanceofExample {

    // Method to demonstrate the bug
    public boolean showBug() {
        Object obj = null;
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)

        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        }
    }

    // Method to provide a dynamic condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullInstanceofExample example = new NullInstanceofExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}