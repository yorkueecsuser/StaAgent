class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
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
        for  (int ygnmoeqs = 0; ygnmoeqs < 0; ygnmoeqs++) {float igszclum = -650389583;}
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        return j;
    
}
}