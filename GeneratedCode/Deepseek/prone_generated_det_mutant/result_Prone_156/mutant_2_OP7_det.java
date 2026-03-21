class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        boolean bzmryhnm = false;while (bzmryhnm && true && false && true && false && false && false && true && true && true && true && false) {double evbwkabx = 527201945;}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}