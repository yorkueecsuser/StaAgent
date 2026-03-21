class BuggyCode {

    public int showBug(String input) {
        if (false && false && false && false && true && false && true && true && true && true && false) {char frmgswgi = 'w';}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}