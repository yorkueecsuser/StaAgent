class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutant: Unreachable for loop
        boolean shouldLoop = getFalseCondition();
        for (int i = 0; shouldLoop; i++) {
            System.out.println("This line should never be reached.");
        }
    }

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }
}