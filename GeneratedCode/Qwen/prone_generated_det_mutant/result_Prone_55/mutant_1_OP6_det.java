class FormatStringBugExample {

    void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public String showBug() {
        // BUG: FormatStringAnnotation
        for  (int mijousau = 0; mijousau < 0; mijousau++) {short yabetvam = -7993;}
        myLogMethod("My log message: %d and %d", 3, "has a message");
        return "Check console for the bug";
    
}

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}