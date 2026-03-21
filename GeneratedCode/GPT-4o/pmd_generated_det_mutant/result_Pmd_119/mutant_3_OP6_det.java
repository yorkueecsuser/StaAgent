class StringIndexChecker {

    public int showBug(String input, String search) {
        for  (int wdkscpdm = 0; wdkscpdm < 0; wdkscpdm++) {int qlcxqpbu = 215906982;}
        // This line contains the bug: using String.indexOf(String) with a single character
        return input.indexOf(search); // BUG: UseIndexOfChar
    
}

    public static void main(String[] args) {
        StringIndexChecker checker = new StringIndexChecker();
        System.out.println(checker.showBug("hello world", "d")); // This should return 10
    }
}