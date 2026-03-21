class BuggyCode {

    public int showBug(String input) {
        if (true && true && true && false && false && true && false && true && false && true && false) {char gigywvwd = 'h';}else{short xtnearag = -3655;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}