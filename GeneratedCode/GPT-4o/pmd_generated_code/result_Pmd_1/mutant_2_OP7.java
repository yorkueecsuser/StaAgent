class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;

        // Inserting an unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
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

    private boolean getUnreachableCondition() {
        // Simulating a method that returns a false boolean value
        return false;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}