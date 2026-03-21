class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        if (true && false && false && false && true && true && false && true && false && false && false) {float pbqaufvy = 658689187;}else{short wlsolopp = -8737;}
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}
}