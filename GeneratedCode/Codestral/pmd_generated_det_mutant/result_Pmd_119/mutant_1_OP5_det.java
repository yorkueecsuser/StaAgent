class BuggyCode {

    public int showBug(String input) {
        int rkuegrbq = 0;switch  (rkuegrbq) {case 1:boolean tnlfcoub = true;break;default:short qwdwqowl = 8008;break;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}