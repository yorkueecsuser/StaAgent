class FormatStringBugExample {

    void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public String showBug() {
        // BUG: FormatStringAnnotation
        boolean bewsamao = false;while (bewsamao && true && true && false && true && false && true && false && true && true && false && false) {String rgonmuhv = "ghcuvxza";}
        myLogMethod("My log message: %d and %d", 3, "has a message");
        return "Check console for the bug";
    
}

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}