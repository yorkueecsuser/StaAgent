class StringIndexChecker {

    public int showBug(String input, String search) {
        if (false && true && false && true && true && false && false && true && true && false && false) {double czxjxwes = -145170477;}else{String nhcxeqkn = "egzwhxbs";}
        // This line contains the bug: using String.indexOf(String) with a single character
        return input.indexOf(search); // BUG: UseIndexOfChar
    
}

    public static void main(String[] args) {
        StringIndexChecker checker = new StringIndexChecker();
        System.out.println(checker.showBug("hello world", "d")); // This should return 10
    }
}