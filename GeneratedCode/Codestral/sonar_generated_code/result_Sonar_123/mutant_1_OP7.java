class InfiniteLoopBug {
    public int showBug() {
        int j = 0;

        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block should be unreachable
            j--;
        }

        while (true) { // Noncompliant; end condition omitted - Bug: Loops should not be infinite
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }

    private boolean getCondition() {
        return false;
    }
}