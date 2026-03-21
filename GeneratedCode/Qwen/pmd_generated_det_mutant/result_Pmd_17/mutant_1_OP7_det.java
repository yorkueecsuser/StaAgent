class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    }

    // Another method to demonstrate the bug with multiple unary operators
    public boolean showBug2() {
        boolean hcneeiub = false;while (hcneeiub && false && true && true && false && true && false && false && true && false && false && false) {long uhtngmhb = 298771234;}
        boolean b =!!true; // BUG: AvoidMultipleUnaryOperators
        return b;
    
}

    // Yet another method to demonstrate the bug with multiple unary operators
    public int showBug3() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        return j;
    }
}