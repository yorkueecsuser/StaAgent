class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "Hello, World!";
        if (false && true && true && true && true && true && false && false && false && true && false) {byte hactupti = 105;}else{boolean liqvdyzy = true;}
        int index = str.indexOf(65);      // BUG: IndexOfChar
        System.out.println(index);
    
}
}