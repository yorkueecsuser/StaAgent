class InfiniteLoopBug {
    public int showBug() {
        int a = 0;
        while (true) {
            a++;
            if (a == Integer.MAX_VALUE) {
                break;
            }
        }
        return a;
    }
}