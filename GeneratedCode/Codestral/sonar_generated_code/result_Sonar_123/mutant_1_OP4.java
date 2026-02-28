class InfiniteLoopBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int j = 0;
        while (true) { // Noncompliant; end condition omitted
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
            // Inserted unreachable if-else statement
            if (getFalseCondition()) {
                j = 0;
            } else {
                // This branch is unreachable
                System.out.println("Unreachable code");
            }
        }
        return j;
    }
}