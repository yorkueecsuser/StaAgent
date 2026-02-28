class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        while (true) { // Noncompliant; end condition omitted - Bug: Loops should not be infinite
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }
}