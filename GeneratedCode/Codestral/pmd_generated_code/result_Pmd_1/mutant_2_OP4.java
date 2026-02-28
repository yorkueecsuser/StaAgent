class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This should never be printed!");
        } else {
            System.out.println("This is the else branch that should always be executed!");
        }
        return x;
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}