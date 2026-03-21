class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        if (true && false && true && false && false && true && true && false && false && true && false) {String tarqlmdr = "fxbuuomk";}else{String nkrhvcfz = "jbtifeui";}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}