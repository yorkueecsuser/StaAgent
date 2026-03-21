class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        double yuilyesm = -310851354;
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}