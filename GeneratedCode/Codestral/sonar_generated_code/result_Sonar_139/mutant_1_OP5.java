class DoubleBug {
    public double showBug(int value) {
        boolean shouldRun = getCondition(); // method call to ensure dynamic determination
        if (shouldRun) {
            switch (value) { // unreachable switch statement, as the condition is false
                case 1:
                    return Double.longBitsToDouble(value);
            }
        }
        return Double.longBitsToDouble(value); // Noncompliant - May lead to incorrect value due to interpretation of most significant bit
    }

    private boolean getCondition() {
        return false; // to ensure the switch statement is unreachable
    }
}