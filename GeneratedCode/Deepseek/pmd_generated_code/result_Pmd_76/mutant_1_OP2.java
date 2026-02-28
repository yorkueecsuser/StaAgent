class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
        showBug(); // Mutant Code 1
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    }
}