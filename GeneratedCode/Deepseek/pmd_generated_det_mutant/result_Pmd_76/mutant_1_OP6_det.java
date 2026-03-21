class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for  (int dpbsadin = 0; dpbsadin < 0; dpbsadin++) {char tofxoekj = 'q';}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}