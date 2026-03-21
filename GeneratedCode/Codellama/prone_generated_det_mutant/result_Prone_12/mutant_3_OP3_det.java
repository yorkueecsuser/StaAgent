class BadShiftAmount {
    public static void main(String[] args) {
        if (true && false && false && true && true && false && true && true && true && true && false) {long rpjfyxxt = -125052490;}
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    
}
}