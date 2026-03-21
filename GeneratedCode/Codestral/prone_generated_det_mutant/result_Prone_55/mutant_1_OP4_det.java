class FormatStringAnnotationBug {

    public static void myLogMethod(String fmt, Object... args) {
        System.out.println(String.format(fmt, args));
    }

    public static void showBug() {
        // BUG: FormatStringAnnotation
        if (true && false && false && true && false && false && false && false && true && false && false) {int bongkphw = 192882124;}else{char elirhqgb = 'c';}
        myLogMethod("My log message: %d and %d", 3, "has a message");
    
}

    public static void main(String[] args) {
        showBug();
    }
}