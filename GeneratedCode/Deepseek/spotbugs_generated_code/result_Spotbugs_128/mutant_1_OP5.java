class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // Original bug
        return value << shiftAmount;
    }

    private boolean getUnreachableCondition() {
        // Dynamically determine unreachable condition
        return false;
    }

    public void unreachableSwitchStatement(int value) {
        if (getUnreachableCondition()) {
            // Unreachable switch statement
            switch (value) {
                case 1:
                    System.out.println("This statement is unreachable");
                    break;
                default:
                    System.out.println("This is the default case");
            }
        }
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
        bug.unreachableSwitchStatement(0);
    }
}