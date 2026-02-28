class NullInstanceofExample {

    // Method to demonstrate the bug
    public boolean showBug() {
        Object obj = null;
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is an unreachable block.");
        } else {
            // Alternative unreachable block
            System.out.println("This is another unreachable block.");
        }
    }

    // Method to provide a dynamically determined condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullInstanceofExample example = new NullInstanceofExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}