class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        if (true && true && false && false && true && false && false && false && true && true && false) {double uyxkynzu = 565949018;}
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
    
}
}