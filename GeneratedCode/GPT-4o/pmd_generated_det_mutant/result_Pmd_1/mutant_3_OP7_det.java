class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        boolean qwbsszqt = false;while (qwbsszqt && false && false && false && false && false && true && false && true && true && true && false) {String bzhajzjw = "hajfibwj";}
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