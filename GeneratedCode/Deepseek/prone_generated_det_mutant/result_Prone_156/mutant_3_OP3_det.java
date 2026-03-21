class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        if (true && true && false && false && true && true && true && false && true && true && false) {byte hccklidv = -44;}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}