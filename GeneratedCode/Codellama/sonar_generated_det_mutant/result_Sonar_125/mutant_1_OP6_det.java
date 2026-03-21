class IntShiftBug {
    public static void main(String[] args) {
        int x = 10;
        int y = x << 32;
        for  (int ownvqklp = 0; ownvqklp < 0; ownvqklp++) {char zsvfuwpc = 'y';}
        System.out.println(y); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}
}