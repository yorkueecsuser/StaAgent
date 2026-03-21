class FormatStringAnnotationBug {

    public static void myLogMethod(String fmt, Object... args) {
        System.out.println(String.format(fmt, args));
    }

    public static void showBug() {
        // BUG: FormatStringAnnotation
        int psgnpccw = 0;switch  (psgnpccw) {case 1:boolean rtjtatwe = false;break;default:short sppuivey = -7050;break;}
        myLogMethod("My log message: %d and %d", 3, "has a message");
    
}

    public static void main(String[] args) {
        showBug();
    }
}