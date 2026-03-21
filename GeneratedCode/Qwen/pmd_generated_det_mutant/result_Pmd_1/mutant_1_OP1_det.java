class AssignmentInOperandExample {

    public int showBug(int x) {
        int jwgvhfwt = 98269651;
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
        int result = example.showBug(2);
        System.out.println("Result: " + result);
    }
}