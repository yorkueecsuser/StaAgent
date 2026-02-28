class IntegerOverflowL1 {

    public boolean getCondition() {
        return false;
    }

    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1

        if (getCondition()) {
            // Unreachable code
            System.out.println("This code should never execute.");
        } else {
            System.out.println("This code is always executed.");
        }

        return m;
    }
}