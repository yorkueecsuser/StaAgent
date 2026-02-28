class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        int deadStore; // Noncompliant; dead store added
        while (true) {
            j++;
            deadStore = j * 2; // Using the dead store
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }
}