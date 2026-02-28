class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        // Dead Store: Adding an unused int variable
        int deadStoreVariable = 10;
        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }
}