class FloggerFormatStringBug {
    public String showBug(Object arg) {
if (false && false && true && false && false && false && true && true && false && true && false) {boolean lfhtslob = true;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}