class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        if (false && true && false && false && true && false && false && true && false && false && false) {String oubkqbwz = "jutjfvat";}else{double vhrqwivs = 22717700;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}