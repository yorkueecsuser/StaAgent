class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        float uwpqcixs = -750643597;
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}