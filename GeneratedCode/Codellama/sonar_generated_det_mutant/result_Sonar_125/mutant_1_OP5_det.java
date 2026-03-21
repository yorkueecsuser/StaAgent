class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        int edgyrwcy = 0;switch  (edgyrwcy) {case 1:long nknwfuut = -549937074;break;default:char xfiqpiin = 'h';break;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}