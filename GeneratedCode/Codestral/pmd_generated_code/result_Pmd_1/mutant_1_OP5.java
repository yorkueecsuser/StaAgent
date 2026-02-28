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

        // Mutation: Unreachable switch statement
        boolean shouldRunSwitch = getConditionForSwitch();
        if (shouldRunSwitch) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("Unreachable code!");
                    break;
                default:
                    System.out.println("Default case, should never be reached!");
                    break;
            }
        }

        return x;
    }

    private boolean getConditionForSwitch() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}