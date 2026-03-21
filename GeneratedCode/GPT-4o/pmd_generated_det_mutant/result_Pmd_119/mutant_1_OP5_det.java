class StringIndexChecker {

    public int showBug(String input, String search) {
        int nwkqqcyl = 0;switch  (nwkqqcyl) {case 1:char dvxgwfpo = 'c';break;default:char wetkgrqk = 'g';break;}
        // This line contains the bug: using String.indexOf(String) with a single character
        return input.indexOf(search); // BUG: UseIndexOfChar
    
}

    public static void main(String[] args) {
        StringIndexChecker checker = new StringIndexChecker();
        System.out.println(checker.showBug("hello world", "d")); // This should return 10
    }
}