class FormatStringAnnotationBug {

    public static void myLogMethod(String fmt, Object... args) {
        System.out.println(String.format(fmt, args));
    }

    public static void showBug() {
        // BUG: FormatStringAnnotation
        boolean lglcabjw = false;while (lglcabjw && true && true && false && true && true && true && true && false && true && true && false) {String hvmynykt = "utnsblbf";}
        myLogMethod("My log message: %d and %d", 3, "has a message");
    
}

    public static void main(String[] args) {
        showBug();
    }
}