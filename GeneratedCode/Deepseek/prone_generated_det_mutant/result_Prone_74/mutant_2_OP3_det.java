class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "Hello, World!";
        if (false && false && false && true && true && true && false && false && true && false && false) {float uzwnfzqd = 961262307;}
        int index = str.indexOf(65);      // BUG: IndexOfChar
        System.out.println(index);
    
}
}