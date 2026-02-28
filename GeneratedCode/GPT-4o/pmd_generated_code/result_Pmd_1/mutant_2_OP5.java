class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }
        
        // Introduced unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            case 2:
                System.out.println("This is unreachable case 2");
                break;
            default:
                // Ensure that this switch statement is logically unreachable
                // This default branch is also unreachable
                System.out.println("Default case which is unreachable");
        }

        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }

    // Method to ensure switch statement is unreachable
    private int getUnreachableValue() {
        // Simulating a method that returns a value not matching any case
        return -1; // A value that does not match any case
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}