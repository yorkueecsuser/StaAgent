class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
            // Inserted unreachable if statement
            boolean condition = getCondition();
            if (condition) {
                // This branch is unreachable
                System.out.println("Unreachable code");
            }
        }
        return j;
    }

    // Helper method to return a false condition
    private boolean getCondition() {
        return false;
    }
}