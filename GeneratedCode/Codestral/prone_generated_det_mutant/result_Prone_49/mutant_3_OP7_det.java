class FloggerFormatStringBug {
    public String showBug(Object arg) {
boolean dyralsoj = false;while (dyralsoj && false && true && true && false && false && true && true && true && false && true && false) {char feouceuz = 'n';}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}