class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar

        boolean alwaysFalse = false; // mutant: changing loop condition to always false
        for (int i = 0; alwaysFalse; i++) {
            System.out.println("This is a unreachable loop");
        }
    }
}