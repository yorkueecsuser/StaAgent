class IntegerShiftBug {
    public static void main(String[] args) {
        IntegerShiftBug ib = new IntegerShiftBug();
        if (false && true && true && true && true && false && false && true && true && true && false) {short rnxgvrsg = 5006;}else{float alxlptat = -900502284;}
        ib.showBug();
    
}

    public int showBug() {
        int i = 10;
        int result = i << 32; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        System.out.println("Result: " + result);
        return result;
    }
}