class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        // Introducing a loop with equivalent do-while
        do {
            // BUG: AssignmentInOperand
            if ((x = getX()) == 3) {
                System.out.println("3!");
            }
        } while (false);  // The loop will only execute once
        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}