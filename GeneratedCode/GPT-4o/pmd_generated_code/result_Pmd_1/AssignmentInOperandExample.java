class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        boolean conditionWhile = getCondition(); // Used to ensure the while loop is unreachable
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            // Unreachable while loop inserted here
            while (conditionWhile) {
                System.out.println("This is unreachable");
            }
            return true;
        }
        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }
    
    private boolean getCondition() {
        // This will always return false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}