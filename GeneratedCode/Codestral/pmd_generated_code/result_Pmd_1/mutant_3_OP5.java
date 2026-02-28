class BuggyCode {
    public int getX() {
        return 3;
    }

    public int getCondition() {
        return 0; // This value will always be 0 to make the switch condition unreachable
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }

        // Mutant Code: Unreachable switch statement
        int condition = getCondition();
        switch(condition) {
            case 1:
                System.out.println("This is unreachable!");
                break;
            default:
                break;
        }

        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}