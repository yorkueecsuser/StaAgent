class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        boolean ljvhnomx = false;while (ljvhnomx && false && false && false && true && true && true && true && true && false && false && false) {float qycrgajf = 671442442;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}