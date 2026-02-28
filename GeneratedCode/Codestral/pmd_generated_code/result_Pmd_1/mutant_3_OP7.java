class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        if ((x = getX()) == 3) {
            // Inserted unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("Unreachable loop!");
            }
            System.out.println("3!");
        }
        return x;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}