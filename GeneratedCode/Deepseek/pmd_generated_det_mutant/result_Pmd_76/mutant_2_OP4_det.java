class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && false && false && false && true && true && true && false && true && true && false) {float vxazgxir = 656565821;}else{short cerahxxf = -1615;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}