class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                j = j; // Mutant: Duplication of the assignment statement
                break;
            }
        }
        return j;
    }
}