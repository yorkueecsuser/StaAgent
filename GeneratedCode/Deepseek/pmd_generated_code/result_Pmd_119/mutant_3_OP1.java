class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        String unusedString = ""; // New dead store
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
    }
}