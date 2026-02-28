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
class AssignmentInOperandExample_Mutant {

    public boolean showBug() {
        int y = 2; // Variable x renamed to y
        if ((y = getY()) == 3) { // Corresponding change in variable name
            System.out.println("3!");
            return true;
        }
        return false;
    }

    private int getY() { // Method getX renamed to getY
        // Simulating a method that returns an integer value
        return 3;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample_Mutant example = new AssignmentInOperandExample_Mutant();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}