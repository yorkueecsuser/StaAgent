class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String zysddlta = "gswvzbsn";
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}