class FormatStringBugExample {

    void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public String showBug() {
        // BUG: FormatStringAnnotation
        int epulvxwa = 0;switch  (epulvxwa) {case 1:boolean okebhudn = false;break;default:char ldoqiufj = 'n';break;}
        myLogMethod("My log message: %d and %d", 3, "has a message");
        return "Check console for the bug";
    
}

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}