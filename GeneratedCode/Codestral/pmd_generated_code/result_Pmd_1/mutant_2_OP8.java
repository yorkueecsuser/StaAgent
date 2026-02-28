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
        return x;
    }

    public int showMutant() {
        int y = 2;
        // MUTANT: AssignmentInOperand with variable renaming
        if ((y = getX()) == 3) {
            System.out.println("3!");
        }
        return y;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
        System.out.println(buggyCode.showMutant());
    }
}