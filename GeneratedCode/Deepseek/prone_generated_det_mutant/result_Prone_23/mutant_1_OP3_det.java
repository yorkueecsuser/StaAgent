class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        if (false && false && false && false && false && false && true && true && false && false && false) {byte thoxmkts = -92;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}