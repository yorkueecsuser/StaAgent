class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int fuzpmfjj = 2;
        // BUG: AssignmentInOperand
        if ((fuzpmfjj = getX()) == 3) {
            System.out.println("3!");
        }
        return fuzpmfjj;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}