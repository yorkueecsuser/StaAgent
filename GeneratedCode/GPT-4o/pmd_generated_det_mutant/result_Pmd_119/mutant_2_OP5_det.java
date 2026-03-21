class StringIndexChecker {

    public int showBug(String input, String search) {
        int rknltghk = 0;switch  (rknltghk) {case 1:long cpmwlfzi = 594269521;break;default:long tngqxmdi = 272383081;break;}
        // This line contains the bug: using String.indexOf(String) with a single character
        return input.indexOf(search); // BUG: UseIndexOfChar
    
}

    public static void main(String[] args) {
        StringIndexChecker checker = new StringIndexChecker();
        System.out.println(checker.showBug("hello world", "d")); // This should return 10
    }
}