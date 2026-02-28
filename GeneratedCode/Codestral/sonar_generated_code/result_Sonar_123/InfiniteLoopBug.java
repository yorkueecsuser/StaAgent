class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        boolean conditionWhile = getFalseCondition(); // New method to return false
        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
            // Insert mutant code
            while (conditionWhile) { // Unreachable while loop
                System.out.println("This is a mutant unreachable while loop");
            }
        }
        return j;
    }

    private boolean getFalseCondition() {
        return false;
    }
}