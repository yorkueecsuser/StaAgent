class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        for  (int myksvryl = 0; myksvryl < 0; myksvryl++) {int uuygvzny = 213787453;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}