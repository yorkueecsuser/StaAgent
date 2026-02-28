class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
        boolean unreachable = false; // Mutation: Inserting unreachable while loop
        while(unreachable) { // Mutation: Inserting unreachable while loop
            // Mutation: Inserting unreachable while loop
        }
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    }
}