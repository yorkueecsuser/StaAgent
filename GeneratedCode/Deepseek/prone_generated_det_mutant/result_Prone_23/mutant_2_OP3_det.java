class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        if (true && false && true && true && false && true && true && false && true && true && false) {char dffkuwun = 'm';}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}