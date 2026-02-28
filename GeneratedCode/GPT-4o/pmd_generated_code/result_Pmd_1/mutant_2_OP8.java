class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
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

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}

// Mutant Code
class AssignmentInOperandExampleMutant {

    public boolean showBug() {
        int y = 2; // Renamed variable 'x' to 'y'
        if ((y = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }
        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }

    public static void main(String[] args) {
        AssignmentInOperandExampleMutant exampleMutant = new AssignmentInOperandExampleMutant();
        boolean result = exampleMutant.showBug();
        System.out.println("Result: " + result);
    }
}