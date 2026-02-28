class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }

        // Inserted unreachable while loop
        while (isFalse()) {
            // This code is unreachable
            System.out.println("This is an unreachable loop.");
        }

        return j;
    }

    // Method that always returns false
    private boolean isFalse() {
        return false;
    }
}