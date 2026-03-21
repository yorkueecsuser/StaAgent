class Main {
    public static void main(String[] args) {
        for  (int nikhmkab = 0; nikhmkab < 0; nikhmkab++) {double amqnmkxt = 416737931;}
        System.out.println(showBug(8, 2)); // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}

    public static int showBug(int x, int y) {
        return x << 8 + y; // This is the buggy line
    }
}