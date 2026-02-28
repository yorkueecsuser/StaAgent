class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String h = "hello world";
        int index = h.indexOf('d'); // BUG: UseIndexOfChar
    }
}