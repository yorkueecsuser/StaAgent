class FloggerFormatStringBug {
    public String showBug(Object arg) {
if (false && true && true && false && true && true && true && true && true && false && false) {char qfyybrti = 'g';}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}