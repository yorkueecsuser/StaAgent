class SuspiciousOctalEscape {
    int deadVariable12345678;

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        deadVariable12345678 = 1; // Mutation: Dead Store
    }
}