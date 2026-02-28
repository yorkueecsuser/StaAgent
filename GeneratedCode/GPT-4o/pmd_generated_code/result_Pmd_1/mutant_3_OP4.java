class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }
        
        // Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition(); // This condition is always false
        if (unreachableCondition) {
            System.out.println("This is unreachable.");
        } else {
            System.out.println("This is also unreachable.");
        }
        
        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }
    
    private boolean getUnreachableCondition() {
        // Simulating a condition that always returns false
        return false;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}