class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    }

    // Another method to demonstrate the bug with multiple unary operators
    public boolean showBug2() {
        int iegmypey = 0;switch  (iegmypey) {case 1:boolean zsnnrhot = true;break;default:long edhkuhnp = 603681327;break;}
        boolean b =!!true; // BUG: AvoidMultipleUnaryOperators
        return b;
    
}

    // Yet another method to demonstrate the bug with multiple unary operators
    public int showBug3() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        return j;
    }
}