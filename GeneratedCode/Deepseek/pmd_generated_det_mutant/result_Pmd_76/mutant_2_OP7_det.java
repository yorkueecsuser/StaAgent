class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean rlhjvpao = false;while (rlhjvpao && true && false && false && false && true && true && false && false && true && false && false) {float fgkwkupi = 883581298;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}