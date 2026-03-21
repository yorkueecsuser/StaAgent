class BuggyCode {

    public int showBug(String input) {
        if (false && true && false && true && false && true && true && false && false && false && false) {byte bzkjwfiz = 35;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}