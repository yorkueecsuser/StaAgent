class BuggyCode {
    public int getX() {
        return 3;
    }

    public boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }

        // Mutant: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This line is unreachable!");
        }

        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}