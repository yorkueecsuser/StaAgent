class FloggerFormatStringBug {
    public String showBug(Object arg) {
if (true && false && true && false && false && true && false && true && true && true && false) {boolean hjescwji = true;}else{float ebfafyfr = 815147210;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}