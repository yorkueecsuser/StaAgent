class InfiniteLoopBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int j = 0;
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This if statement is unreachable
            System.out.println("This line should never be executed");
        }
        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }
}