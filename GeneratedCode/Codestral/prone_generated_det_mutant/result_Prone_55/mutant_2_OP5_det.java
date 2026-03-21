class FormatStringAnnotationBug {

    public static void myLogMethod(String fmt, Object... args) {
        System.out.println(String.format(fmt, args));
    }

    public static void showBug() {
        // BUG: FormatStringAnnotation
        int ezodpeon = 0;switch  (ezodpeon) {case 1:String rcemdzhv = "qqpspmik";break;default:boolean bcqthpns = false;break;}
        myLogMethod("My log message: %d and %d", 3, "has a message");
    
}

    public static void main(String[] args) {
        showBug();
    }
}