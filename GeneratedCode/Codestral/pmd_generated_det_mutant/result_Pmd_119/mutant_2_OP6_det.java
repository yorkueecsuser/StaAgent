class BuggyCode {

    public int showBug(String input) {
        for  (int dvkjxist = 0; dvkjxist < 0; dvkjxist++) {char mhknoxxk = 's';}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}