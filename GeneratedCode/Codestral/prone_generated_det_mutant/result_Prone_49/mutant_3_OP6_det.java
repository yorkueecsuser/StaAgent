class FloggerFormatStringBug {
    public String showBug(Object arg) {
for  (int hflbjebl = 0; hflbjebl < 0; hflbjebl++) {int bailjpbb = -936010406;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}