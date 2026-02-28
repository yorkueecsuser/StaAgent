class BuggyCode {
    public int getX() {
        return 3;
    }

    public boolean getCondition() {
        return false; // This method will always return false, making the if statement unreachable
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        // Mutated Code: Unreachable if statement
        if (getCondition()) {
            System.out.println("This statement is unreachable!");
        }
        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}