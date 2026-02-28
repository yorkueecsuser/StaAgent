class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
            boolean unreachableCondition = getUnreachableCondition(); // Correct usage
            for (int i = 0; unreachableCondition; i++) { // Correct usage
                // This block will never be executed because unreachableCondition is always false
            }
        }
        return j;
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}