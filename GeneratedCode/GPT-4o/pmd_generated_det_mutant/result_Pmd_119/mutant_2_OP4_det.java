class StringIndexChecker {

    public int showBug(String input, String search) {
        if (false && true && false && true && false && true && true && true && true && true && false) {int asotmyhy = -329256341;}else{byte xvgomnvk = -85;}
        // This line contains the bug: using String.indexOf(String) with a single character
        return input.indexOf(search); // BUG: UseIndexOfChar
    
}

    public static void main(String[] args) {
        StringIndexChecker checker = new StringIndexChecker();
        System.out.println(checker.showBug("hello world", "d")); // This should return 10
    }
}