class AssignmentInOperandExample {

    public int showBug(int x) {
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
        }
        return x;
    }

    private int getX() {
        return 3; // This method returns a constant value for demonstration purposes
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        int atiiftel = example.showBug(2);
        System.out.println("Result: " + atiiftel);
    }
}