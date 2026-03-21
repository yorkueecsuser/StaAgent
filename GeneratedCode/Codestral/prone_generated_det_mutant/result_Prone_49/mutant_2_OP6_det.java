class FloggerFormatStringBug {
    public String showBug(Object arg) {
for  (int bfrcqgii = 0; bfrcqgii < 0; bfrcqgii++) {byte xmiljper = 86;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}