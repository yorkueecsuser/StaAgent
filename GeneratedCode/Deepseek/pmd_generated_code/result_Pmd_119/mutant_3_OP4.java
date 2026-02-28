class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar

        // Mutated code:
        boolean alwaysFalse = true; // Alter mutation: Use compile-time constant `false`
        if (alwaysFalse) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}