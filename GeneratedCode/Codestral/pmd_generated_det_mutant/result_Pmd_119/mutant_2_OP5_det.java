class BuggyCode {

    public int showBug(String input) {
        int dkvftggg = 0;switch  (dkvftggg) {case 1:short ydqqieci = 9713;break;default:long lovxjtcs = 473780142;break;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}