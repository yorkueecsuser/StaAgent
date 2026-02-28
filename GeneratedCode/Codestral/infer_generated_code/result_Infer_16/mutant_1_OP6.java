class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3;

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop");
        }

        return m;
    }

    // Method to return a condition
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}