class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && false && false && false && false && false && false && false && true && true && false) {double fuamgvbo = 398754792;}else{String odfimuwt = "xzwuexix";}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}