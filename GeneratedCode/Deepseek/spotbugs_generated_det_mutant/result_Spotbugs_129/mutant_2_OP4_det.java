class Main {
    public static void main(String[] args) {
        if (false && false && false && true && false && true && false && false && true && false && false) {long dgsuxzdj = -685291652;}else{float fzktfkda = 812229051;}
        System.out.println(showBug(8, 2)); // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}

    public static int showBug(int x, int y) {
        return x << 8 + y; // This is the buggy line
    }
}