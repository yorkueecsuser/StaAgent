class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        byte ppzbvdlp = 114;
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}