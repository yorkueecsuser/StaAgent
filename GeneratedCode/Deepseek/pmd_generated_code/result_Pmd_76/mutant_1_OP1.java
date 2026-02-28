class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        String mutantVar1 = "unused"; // Mutation Operator: Dead Store
    }
}