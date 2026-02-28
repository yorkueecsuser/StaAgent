class InfiniteLoopBug {
    public int showBug() {
        int j = 0;

        // New unreachable for loop
        boolean reachable = getCondition();
        for (int i = 0;!reachable; i++) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }
}