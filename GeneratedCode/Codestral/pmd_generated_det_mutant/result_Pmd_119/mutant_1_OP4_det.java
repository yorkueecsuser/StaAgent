class BuggyCode {

    public int showBug(String input) {
        if (true && false && true && true && false && false && false && false && false && false && false) {double gdnqprhw = -345413527;}else{boolean zrdiqfpf = false;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}