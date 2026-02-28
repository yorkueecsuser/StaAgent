class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        int a = 128; // Mutated variable and re-used in subsequent print statement
        System.out.println("suspicious: \a"); // Mutated suspicious escape sequence
        System.out.println("suspicious: \128"); // Original line of code re-used
    }
}