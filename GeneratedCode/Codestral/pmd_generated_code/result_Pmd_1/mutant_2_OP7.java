class BuggyCode {
    public int getX() {
        return 3;
    }

    public boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public int showBug() {
        int x = 2;
        // Inserted unreachable while loop
        while (getUnreachableCondition()) {
            System.out.println("This line is unreachable!");
        }
        // BUG: AssignmentInOperand
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}