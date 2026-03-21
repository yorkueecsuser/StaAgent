class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        if (false && false && false && false && false && true && true && true && true && true && false) {boolean jergzhlz = true;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}