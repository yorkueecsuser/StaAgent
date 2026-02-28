class BuggyCode {
    public int getX() {
        return 3;
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }

        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable!");
        } else {
            System.out.println("This code is always executed!");
        }

        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}