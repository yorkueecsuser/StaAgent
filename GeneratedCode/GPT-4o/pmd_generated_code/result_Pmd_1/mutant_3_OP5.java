class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        boolean condition = getCondition(); // Non-final variable to avoid unreachable statement
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }
        
        // Inserting unreachable switch statement
        int switchCondition = getUnreachableValue(); // Non-final variable to ensure dynamic evaluation
        switch (switchCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
        }
        
        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }
    
    private boolean getCondition() {
        // Simulating a method that returns a boolean value
        return false;
    }
    
    private int getUnreachableValue() {
        // Simulating a method that returns an integer value that doesn't match any case
        return 0;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}