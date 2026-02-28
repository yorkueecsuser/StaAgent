class InfiniteLoopBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int j = 0;
        while (true) {
            // Mutant code added:
            for (int i = 0; getFalseCondition(); i++) {
                // This loop is unreachable because the condition is always false
                // It's added to introduce a mutant based on the "Unreachable for loop" mutation operator
                System.out.println("This line should never be printed.");
            }

            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }
}