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

        // Inserted unreachable if-else branch
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This line will never be executed.");
        } else {
            System.out.println("This line will always be executed.");
        }

        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}