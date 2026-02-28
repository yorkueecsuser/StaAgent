class BuggyCode {
    public int getX() {
        return 3;
    }

    // Method to generate the condition for the for loop
    public boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int x = 2;
        // BUG: AssignmentInOperand
        if ((x = getX()) == 3) {
            // Mutant: Unreachable for loop
            boolean conditionFor = getUnreachableCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("Unreachable loop!");
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