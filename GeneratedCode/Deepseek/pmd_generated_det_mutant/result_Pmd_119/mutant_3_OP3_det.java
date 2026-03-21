class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        if (true && true && false && false && false && false && false && true && true && false && false) {String pvvjbzau = "ttbkyxda";}
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
    
}
}