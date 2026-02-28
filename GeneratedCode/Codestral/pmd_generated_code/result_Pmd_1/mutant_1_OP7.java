class BuggyCode {
    public int getX() {
        return 3;
    }

    public boolean getCondition() {
        return false;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        if ((x = getX()) == 3) {
            System.out.println("3!");
            // MUTANT: Unreachable while loop
            while (getCondition()) {
                System.out.println("This line should never be executed.");
            }
        }
        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}