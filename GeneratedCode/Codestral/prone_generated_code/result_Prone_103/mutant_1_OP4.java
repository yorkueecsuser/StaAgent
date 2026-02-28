class LossyPrimitiveCompareBug {
    public int showBug() {
        // Original code
        int comparisonResult = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);

        // Mutant code: Inserting unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This block is unreachable.");
        } else {
            // This block is reachable
            System.out.println("This block is reachable.");
        }

        return comparisonResult;
    }

    // Method to return a false condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }
}