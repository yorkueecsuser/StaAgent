class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        byte lysbbdts = 61;
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}