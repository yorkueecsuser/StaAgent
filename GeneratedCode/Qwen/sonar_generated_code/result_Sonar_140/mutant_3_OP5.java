class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    public int showBug() {
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case is reachable if condition is true
                break;
            default:
                // This default case is unreachable because condition is never false
                break;
        }
        return pickNumber();
    }

    private boolean getCondition() {
        // This method returns true, making the switch statement's default case unreachable
        return true;
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}