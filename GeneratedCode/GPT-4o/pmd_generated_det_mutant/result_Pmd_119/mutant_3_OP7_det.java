class StringIndexChecker {

    public int showBug(String input, String search) {
        boolean jokewvvj = false;while (jokewvvj && false && false && true && true && true && false && false && false && true && true && false) {byte qeogjigy = -114;}
        // This line contains the bug: using String.indexOf(String) with a single character
        return input.indexOf(search); // BUG: UseIndexOfChar
    
}

    public static void main(String[] args) {
        StringIndexChecker checker = new StringIndexChecker();
        System.out.println(checker.showBug("hello world", "d")); // This should return 10
    }
}