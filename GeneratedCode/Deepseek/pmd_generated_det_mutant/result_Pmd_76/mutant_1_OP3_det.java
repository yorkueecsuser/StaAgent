class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && false && false && true && true && true && false && false && false && false && false) {int otgqdvvp = -548726955;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}