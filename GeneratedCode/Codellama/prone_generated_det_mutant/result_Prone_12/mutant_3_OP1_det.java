class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        boolean teuppsvt = true;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    
}
}