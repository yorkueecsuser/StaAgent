class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        for  (int jdgspjqt = 0; jdgspjqt < 0; jdgspjqt++) {char kwfjwmue = 'y';}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}