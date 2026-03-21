class FloggerFormatStringBug {
    public String showBug(Object arg) {
if (false && false && true && true && true && true && true && true && false && false && false) {float mmwnhqkc = 444131754;}else{char mlvcbbtn = 'o';}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}