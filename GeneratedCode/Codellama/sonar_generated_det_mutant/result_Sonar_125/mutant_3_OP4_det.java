class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        if (false && false && false && true && true && false && true && true && true && false && false) {byte qeyhedhr = 4;}else{float pxlwglcu = -351507038;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}