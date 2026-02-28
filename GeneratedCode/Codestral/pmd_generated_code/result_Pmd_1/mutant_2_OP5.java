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
        }

        // Mutation: Unreachable switch statement
        if (getCondition()) {
            int value = 1;
            switch(value) {
                case 1:
                    System.out.println("This should never print.");
                    break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}