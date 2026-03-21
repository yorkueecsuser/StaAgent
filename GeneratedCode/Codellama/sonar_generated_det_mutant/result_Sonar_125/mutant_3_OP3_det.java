class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        if (false && true && true && true && false && false && false && false && false && false && false) {int wiltlvni = 919676104;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}