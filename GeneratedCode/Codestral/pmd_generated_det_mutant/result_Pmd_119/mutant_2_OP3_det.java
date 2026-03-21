class BuggyCode {

    public int showBug(String input) {
        if (true && true && true && false && false && false && false && false && false && true && false) {boolean tbsynavg = true;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}