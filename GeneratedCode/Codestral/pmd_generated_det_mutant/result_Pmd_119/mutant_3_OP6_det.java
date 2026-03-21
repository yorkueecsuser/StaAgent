class BuggyCode {

    public int showBug(String input) {
        for  (int inwafuvh = 0; inwafuvh < 0; inwafuvh++) {short lpiwnxdx = 6160;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}