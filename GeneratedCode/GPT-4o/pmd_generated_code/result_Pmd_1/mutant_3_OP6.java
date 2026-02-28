class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }
        // Introducing an unreachable for loop
        boolean conditionFor = getCondition(); // Ensure condition is dynamically determined
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code inside for loop.");
        }
        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }

    private boolean getCondition() {
        // This method returns false to ensure the for-loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}