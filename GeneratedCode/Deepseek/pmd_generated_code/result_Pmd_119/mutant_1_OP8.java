class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int f =  s.indexOf('d'); // Mutated code
    }
}