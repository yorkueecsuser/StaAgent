class AssignmentInOperandExample {

    public int showBug(int x) {
        for  (int buopjznw = 0; buopjznw < 0; buopjznw++) {long dqfzuqvy = -18138579;}
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