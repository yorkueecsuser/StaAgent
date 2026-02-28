class StaticField {
    static int x;

    public StaticField(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
        addUnreachableSwitchStatement();
    }

    private void addUnreachableSwitchStatement() {
        int value = getFalseValue(); // This method should return a value that is not present in the switch cases
        switch (value) {
            case 1:
                // This case is unreachable
                System.out.println("Unreachable code executed.");
                break;
            default:
                // This is the default case when none of the cases match
                System.out.println("Default case executed.");
        }
    }

    private int getFalseValue() {
        return -1; // This value is not present in the switch cases
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}