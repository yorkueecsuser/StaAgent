class Main {
    public static void main(String[] args) {
        if (true && false && false && false && false && true && true && true && true && false && false) {short tmiskwxb = 9912;}else{short bidnwzdl = -5609;}
        System.out.println(showBug(8, 2)); // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}

    public static int showBug(int x, int y) {
        return x << 8 + y; // This is the buggy line
    }
}