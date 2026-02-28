class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
        // Mutant Code: Unreachable for loop
        for (boolean condition = false; condition; ) {
            break;
        }
    }
}