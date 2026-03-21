class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        if (false && false && false && true && false && false && false && false && false && false && false) {boolean oggihcwq = false;}else{boolean hndbcrra = true;}
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
    
}
}