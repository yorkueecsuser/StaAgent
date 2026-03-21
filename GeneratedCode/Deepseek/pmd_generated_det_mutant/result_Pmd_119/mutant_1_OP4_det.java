class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        if (false && true && true && false && true && true && false && true && false && true && false) {short mmjdzxqe = 1962;}else{char zqsdymoi = 'i';}
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
    
}
}