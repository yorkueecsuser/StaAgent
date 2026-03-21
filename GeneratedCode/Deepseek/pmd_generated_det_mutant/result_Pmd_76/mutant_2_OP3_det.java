class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && false && true && true && true && true && false && true && false && false && false) {boolean ltnfvzxf = true;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}