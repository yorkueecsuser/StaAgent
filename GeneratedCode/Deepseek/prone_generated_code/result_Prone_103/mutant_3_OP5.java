class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        boolean unreachableSwitchCondition = getUnreachableSwitchCondition();
        // Mutant Code: Unreachable Switch Statement
        switch (unreachableSwitchCondition) {
            case true:
                return Float.compare(max, diff);
            case false:
                break;
        }
        return Float.compare(max, diff);
    }

    // This method is used to ensure that the switch statement is always unreachable
    private boolean getUnreachableSwitchCondition() {
        return false;
    }
}