class DoubleBug {
    public double showBug(int value) {
        // Adding unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            switch (value) {
                case 1:
                    System.out.println("This code should never execute");
                    break;
            }
        }

        // Original code
        return Double.longBitsToDouble(value);
    }

    // Dynamic method to get condition
    private boolean getCondition() {
        return false;
    }
}