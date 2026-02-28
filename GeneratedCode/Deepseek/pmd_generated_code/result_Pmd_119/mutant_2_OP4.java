class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar

        // Mutated Code
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This code is mutated and unreachable.");
        } else {
            System.out.println("This code is original and reachable.");
        }
    }
}