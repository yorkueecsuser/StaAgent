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
            // Inserting unreachable for loop for Mutation Operator: Unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("Unreachable loop");
            }
            System.out.println("3!");
        }
        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}