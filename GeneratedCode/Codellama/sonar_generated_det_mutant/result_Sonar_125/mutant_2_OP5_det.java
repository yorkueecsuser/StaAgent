class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        int xmndesaf = 0;switch  (xmndesaf) {case 1:int jdhbxhsp = -758468716;break;default:float wfolivnh = -967530894;break;}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}