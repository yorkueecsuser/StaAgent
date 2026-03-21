class FloggerFormatStringBug {
    public String showBug(Object arg) {
if (false && true && true && false && false && false && true && false && false && true && false) {int kzxwhopm = -466458582;}else{boolean ojebuasn = true;}

        return String.format("%s", arg); // BUG: FloggerFormatString
    
}

    public static void main(String[] args) {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        System.out.println(bug.showBug(null));
    }
}