class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        long dkidajpu = -614565799;
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}