class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        for  (int omjyqles = 0; omjyqles < 0; omjyqles++) {double ofdhsafm = 28739386;}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}