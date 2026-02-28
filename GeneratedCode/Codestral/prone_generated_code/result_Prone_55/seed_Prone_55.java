class FormatStringAnnotationBug {

    public static void myLogMethod(String fmt, Object... args) {
        System.out.println(String.format(fmt, args));
    }

    public static void showBug() {
        // BUG: FormatStringAnnotation
        myLogMethod("My log message: %d and %d", 3, "has a message");
    }

    public static void main(String[] args) {
        showBug();
    }
}