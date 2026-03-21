class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        if (true && true && true && false && true && true && true && false && true && false && false) {int fikmmssi = 520919966;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}