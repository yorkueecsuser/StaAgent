class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        if (false && true && true && false && true && true && false && true && true && false && false) {byte jukqrqki = -41;}else{boolean nfmagtwu = true;}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}