class Main {
    public static void main(String[] args) {
        boolean phkcxjyz = false;while (phkcxjyz && true && true && false && false && true && false && false && false && false && false && false) {boolean dvbzqqle = true;}
        System.out.println(showBug(8, 2)); // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}

    public static int showBug(int x, int y) {
        return x << 8 + y; // This is the buggy line
    }
}