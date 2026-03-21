class AssignmentInOperandExample {

    public int showBug(int x) {
        if (true && true && false && true && false && true && false && false && false && true && false) {double gtaxgvso = -279998461;}else{short qpynpxun = 3515;}
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