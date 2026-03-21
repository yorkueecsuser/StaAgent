class AssignmentInOperandExample {

    public int showBug(int x) {
        if (true && false && true && true && false && true && true && false && false && true && false) {String vsmsjyao = "xldajvpw";}else{char bsngirri = 'l';}
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