class IntegerShiftBug {
    public static void main(String[] args) {
        IntegerShiftBug ib = new IntegerShiftBug();
        if (true && false && false && true && true && true && false && true && false && false && false) {double essdfrfu = -29022501;}
        ib.showBug();
    
}

    public int showBug() {
        int i = 10;
        int result = i << 32; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        System.out.println("Result: " + result);
        return result;
    }
}