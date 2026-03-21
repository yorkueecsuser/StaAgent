class BuggyCode {

    public int showBug(String input) {
        boolean sdyuvfnc = false;while (sdyuvfnc && false && true && false && true && false && false && false && true && false && true && false) {boolean oocgovdg = false;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}