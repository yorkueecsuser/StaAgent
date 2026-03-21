class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        for  (int dutxtwwk = 0; dutxtwwk < 0; dutxtwwk++) {char abtfmfmj = 'l';}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}