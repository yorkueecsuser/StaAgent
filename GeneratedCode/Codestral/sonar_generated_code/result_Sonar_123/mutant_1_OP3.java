class InfiniteLoopBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int j = 0;
        while (true) {
            j++;
            if (getFalseCondition()) { // Unreachable if statement
                System.out.println("This line should never be executed");
            }
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }
}