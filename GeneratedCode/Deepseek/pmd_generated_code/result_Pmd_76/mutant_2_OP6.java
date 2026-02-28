class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        
        // Mutant code
        int i = 0;
        for (i = 0; false; i++) {
            // do nothing, unreachable loop
        }
    }
}