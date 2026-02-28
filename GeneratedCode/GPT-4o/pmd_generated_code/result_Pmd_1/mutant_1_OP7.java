class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        boolean unreachableCondition = getUnreachableCondition();
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            // Adding an unreachable while loop
            while (unreachableCondition) {
                System.out.println("This will never be printed.");
            }
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
        // Method simulating a condition that always returns false
        return false;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}