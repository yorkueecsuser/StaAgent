class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int undnqzhu = 2;
        // BUG: AssignmentInOperand
        if ((undnqzhu = getX()) == 3) {
            System.out.println("3!");
        }
        return undnqzhu;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}