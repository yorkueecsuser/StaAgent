class StringIndexChecker {

    public int showBug(String input, String search) {
        boolean tdxzpdri = false;while (tdxzpdri && false && false && false && false && false && false && false && false && false && true && false) {long lluamckr = 239910944;}
        // This line contains the bug: using String.indexOf(String) with a single character
        return input.indexOf(search); // BUG: UseIndexOfChar
    
}

    public static void main(String[] args) {
        StringIndexChecker checker = new StringIndexChecker();
        System.out.println(checker.showBug("hello world", "d")); // This should return 10
    }
}