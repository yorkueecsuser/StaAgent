class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }
        
        // Inserted unreachable if-else statement
        // Using a non-final method call to determine the condition
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This won't run.");
        } else {
            System.out.println("This also won't run.");
        }

        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }

    private boolean getUnreachableCondition() {
        // Simulating a method that returns false to make the branch unreachable
        return false;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}