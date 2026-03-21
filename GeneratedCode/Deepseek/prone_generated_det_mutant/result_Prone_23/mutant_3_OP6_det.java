class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        for  (int idphczmk = 0; idphczmk < 0; idphczmk++) {long wlgqdeim = -776773601;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}