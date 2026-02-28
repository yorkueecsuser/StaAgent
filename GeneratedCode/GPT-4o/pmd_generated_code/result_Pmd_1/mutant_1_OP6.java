class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        // Inserting an unreachable for loop
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("Unreachable for loop");
        }

        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }
        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }
    
    private boolean getLoopCondition() {
        // Simulating a method that always returns false
        return false;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}