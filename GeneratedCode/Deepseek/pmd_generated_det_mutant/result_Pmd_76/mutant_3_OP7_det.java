class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean egkhfsmx = false;while (egkhfsmx && true && true && false && false && true && false && true && false && true && false && false) {byte srdhylzv = 34;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}