class FloggerFormatStringBug {
    public String showBug(Object arg) {
boolean wmezbakw = false;while (wmezbakw && true && true && true && false && false && true && false && false && false && true && false) {short evgvrfkl = 7769;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}