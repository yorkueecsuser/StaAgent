class BuggyCode {

    public int showBug(String input) {
        if (true && false && true && true && true && false && true && true && true && false && false) {int cjwsnlve = 920927761;}else{double bjdjvtdb = -168821759;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}