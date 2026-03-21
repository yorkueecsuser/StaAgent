class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        boolean wcxzwhcf = false;while (wcxzwhcf && true && true && true && true && true && true && false && false && false && false && false) {short koyluuna = -5881;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}