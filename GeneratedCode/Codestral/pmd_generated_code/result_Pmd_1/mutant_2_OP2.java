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

        // Mutant: Duplicated assignment statement
        int y = x;

        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}