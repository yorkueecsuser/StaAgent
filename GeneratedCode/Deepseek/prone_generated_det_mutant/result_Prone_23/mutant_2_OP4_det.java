class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        if (true && true && true && false && false && false && true && true && true && false && false) {short efhhhcor = 4234;}else{byte snysqtsg = 27;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}