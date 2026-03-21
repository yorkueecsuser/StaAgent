class FloggerFormatStringBug {
    public String showBug(Object arg) {
for  (int lkeicmqe = 0; lkeicmqe < 0; lkeicmqe++) {boolean nnsyaeux = false;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}