class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        int zwzzcooi = 0;switch  (zwzzcooi) {case 1:long xtghclkq = 931750675;break;default:char tvfbmtyw = 'i';break;}
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