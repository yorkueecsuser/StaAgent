class FormatStringAnnotationBug {

    public static void myLogMethod(String fmt, Object... args) {
        System.out.println(String.format(fmt, args));
    }

    public static void showBug() {
        // BUG: FormatStringAnnotation
        int wvsvuiyh = 0;switch  (wvsvuiyh) {case 1:long tcbvrbws = -651888920;break;default:byte ychbzpls = -72;break;}
        myLogMethod("My log message: %d and %d", 3, "has a message");
    
}

    public static void main(String[] args) {
        showBug();
    }
}