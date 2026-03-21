class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        boolean qkxdrcvk = false;while (qkxdrcvk && true && true && true && true && false && true && false && true && false && false && false) {char gsflqnao = 'f';}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}