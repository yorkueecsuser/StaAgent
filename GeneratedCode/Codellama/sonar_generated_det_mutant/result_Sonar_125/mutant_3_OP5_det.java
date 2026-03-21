class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        int rrwchsnf = 0;switch  (rrwchsnf) {case 1:String wbpazyrz = "uytceerq";break;default:char hsnjinvd = 'z';break;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}