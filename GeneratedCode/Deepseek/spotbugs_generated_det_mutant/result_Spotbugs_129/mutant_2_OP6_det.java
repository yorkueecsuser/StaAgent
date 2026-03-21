class Main {
    public static void main(String[] args) {
        for  (int jhzillfr = 0; jhzillfr < 0; jhzillfr++) {short ptfopuoi = 5717;}
        System.out.println(showBug(8, 2)); // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}

    public static int showBug(int x, int y) {
        return x << 8 + y; // This is the buggy line
    }
}