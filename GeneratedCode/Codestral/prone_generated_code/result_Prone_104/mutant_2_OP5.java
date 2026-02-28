class MathRoundIntLongBug {

    public int showBug(long number) {
        boolean condition = falseCondition();
        if (condition) {
            switch (number) {
                case 1: // This case is unreachable as the condition is always false
                    break;
            }
        }
        return Math.round(number);
    }

    private boolean falseCondition() {
        return false; // This method always returns false
    }
}