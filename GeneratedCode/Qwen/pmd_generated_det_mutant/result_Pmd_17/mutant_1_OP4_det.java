class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        if (false && false && true && false && true && true && false && false && true && true && false) {double fsspprla = 995837960;}else{double gdwoxwlc = -970858622;}
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