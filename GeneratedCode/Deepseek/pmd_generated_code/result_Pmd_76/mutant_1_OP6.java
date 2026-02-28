class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape

        // Generated mutant code that follows the "Unreachable for loop" mutation operator
        boolean conditionFor = false; 
        for (int i = 0; conditionFor; i++) { 
            // unreachable code
        }
    }
}