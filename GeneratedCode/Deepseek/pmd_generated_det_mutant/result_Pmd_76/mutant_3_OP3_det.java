class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && true && false && true && false && false && true && false && false && true && false) {double possyspa = 390741847;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}