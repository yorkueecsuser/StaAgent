class BuggyCode {

    public int showBug(String input) {
        int boyubbnf = 0;switch  (boyubbnf) {case 1:char ptayhmkk = 'r';break;default:boolean iooonzah = false;break;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}