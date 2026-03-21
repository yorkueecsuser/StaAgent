class FloggerFormatStringBug {
    public String showBug(Object arg) {
boolean wgaknvaz = false;while (wgaknvaz && true && true && true && true && false && false && false && false && true && false && false) {byte ttixdfwn = 68;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}