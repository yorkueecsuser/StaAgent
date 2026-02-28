class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        boolean unreachableCondition = false; // Newly added code
        while (true) {
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
            if (unreachableCondition) { // Newly added unreachable if-else statement
                System.out.println("This code is unreachable");
            } else {
                System.out.println("This is the else part of the unreachable if-else statement");
            }
        }
        return j;
    }

    private boolean getCondition() { // Newly added method
        return false;
    }
}