class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        if (false && false && true && false && true && false && false && true && true && true && false) {byte dinezxsd = 124;}
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
    
}
}