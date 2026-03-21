class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && false && true && true && true && true && false && true && true && false && false) {short wzkvkfbt = 6113;}else{double bjfkilmr = 934763546;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}