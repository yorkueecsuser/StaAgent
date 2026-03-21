class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        if (false && false && false && false && false && true && true && false && true && false && false) {int skegllat = 926563645;}
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    
}

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}