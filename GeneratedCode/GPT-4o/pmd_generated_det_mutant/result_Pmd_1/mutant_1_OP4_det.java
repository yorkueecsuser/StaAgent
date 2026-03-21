class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        if (false && true && true && false && true && false && true && false && false && true && false) {long bqwvcgcw = 868809416;}else{char zwdwnkcn = 'm';}
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