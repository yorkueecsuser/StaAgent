class InfiniteLoopBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int j = 0;
        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
            if (getFalseCondition()) {
                System.out.println("Unreachable code");
            } else {
                System.out.println("Alternate unreachable code");
            }
        }
        return j;
    }
}