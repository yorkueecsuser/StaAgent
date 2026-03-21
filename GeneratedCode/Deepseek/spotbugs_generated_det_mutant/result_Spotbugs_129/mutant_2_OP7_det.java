class Main {
    public static void main(String[] args) {
        boolean hxpginmw = false;while (hxpginmw && false && false && true && true && false && true && false && false && false && true && false) {short efwvujmc = 7805;}
        System.out.println(showBug(8, 2)); // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}

    public static int showBug(int x, int y) {
        return x << 8 + y; // This is the buggy line
    }
}