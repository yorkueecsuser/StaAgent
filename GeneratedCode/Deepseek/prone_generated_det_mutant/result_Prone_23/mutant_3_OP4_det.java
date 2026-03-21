class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        if (true && false && true && false && false && false && false && true && true && false && false) {double uqkobbwg = 652038104;}else{boolean etrgfuwn = false;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}