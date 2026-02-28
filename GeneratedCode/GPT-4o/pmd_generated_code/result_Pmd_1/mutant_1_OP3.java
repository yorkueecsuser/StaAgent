class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }
        
        // Adding an unreachable if branch
        boolean unreachableCondition = getAlwaysFalseCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
        
        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }
    
    private boolean getAlwaysFalseCondition() {
        // Dynamically returns false to ensure the if condition is always false
        return false;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}