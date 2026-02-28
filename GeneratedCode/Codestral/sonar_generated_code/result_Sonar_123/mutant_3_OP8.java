class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        int i = j; // added: the new variable name
        while (true) {
            i++; // changed from j++ to i++
            if (i == Integer.MAX_VALUE) {
                break;
            }
        }
        return i; // changed from j to i
    }
}