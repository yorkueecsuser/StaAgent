class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        while (true) {
            j++;
            j++; // Mutant code: duplicate of the increment operation
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }
}