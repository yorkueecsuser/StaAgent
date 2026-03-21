class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        if (false && true && true && false && true && true && true && true && true && false && false) {char ydmnhbpu = 's';}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    // Another method to demonstrate the bug with multiple unary operators
    public boolean showBug2() {
        boolean b =!!true; // BUG: AvoidMultipleUnaryOperators
        return b;
    }

    // Yet another method to demonstrate the bug with multiple unary operators
    public int showBug3() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        return j;
    }
}