class IntegerOverflowL1 {
    private boolean getCondition() {
        return false; // This method returns false to ensure the loop is unreachable
    }

    public int showBug() {
        int n = Integer.MAX_VALUE;

        // Adding an unreachable for loop as per the mutation operator
        for (int i = 0; getCondition(); i++) {
            System.out.println("This statement will never be printed");
        }

        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    }
}