class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        // Inserting an unreachable for loop with a dynamic condition
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable");
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
        // Simulating a method that returns a false condition to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}