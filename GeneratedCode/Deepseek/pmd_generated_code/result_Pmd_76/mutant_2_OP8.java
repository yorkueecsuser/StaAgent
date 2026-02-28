class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    }

    public static void showMutant() {
        System.out.println("mutant: \128"); // Mutation: Renaming
    }
}