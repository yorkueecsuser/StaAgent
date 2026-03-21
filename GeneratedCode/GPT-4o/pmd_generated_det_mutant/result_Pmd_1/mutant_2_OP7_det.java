class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        boolean ktjrjgca = false;while (ktjrjgca && false && true && true && false && false && true && true && true && false && false && false) {int bxxzgfqz = -879413261;}
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