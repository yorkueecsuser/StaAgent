class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        if (false && false && false && true && true && false && true && true && false && false && false) {int xjnutbfo = -378103031;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}