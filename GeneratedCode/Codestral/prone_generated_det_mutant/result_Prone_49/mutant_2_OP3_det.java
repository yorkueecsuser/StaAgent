class FloggerFormatStringBug {
    public String showBug(Object arg) {
if (false && false && false && false && false && true && true && true && true && true && false) {byte kpqfeblz = -22;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}