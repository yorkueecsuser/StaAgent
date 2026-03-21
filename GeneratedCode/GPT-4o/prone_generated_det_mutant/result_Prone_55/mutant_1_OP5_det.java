class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        int heorqpll = 0;switch  (heorqpll) {case 1:double wfhvjjee = -435030380;break;default:String dvvjcxkg = "zsbqdzub";break;}
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    
}

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}