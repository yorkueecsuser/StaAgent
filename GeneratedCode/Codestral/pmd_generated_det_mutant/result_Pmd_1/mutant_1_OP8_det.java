class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int bsmqwimw = 2;
        // BUG: AssignmentInOperand
        if ((bsmqwimw = getX()) == 3) {
            System.out.println("3!");
        }
        return bsmqwimw;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}