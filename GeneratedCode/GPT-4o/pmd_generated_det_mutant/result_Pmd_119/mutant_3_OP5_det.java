class StringIndexChecker {

    public int showBug(String input, String search) {
        int ejnejkex = 0;switch  (ejnejkex) {case 1:float kwtpfdra = -879595221;break;default:char bkjcvhky = 'g';break;}
        // This line contains the bug: using String.indexOf(String) with a single character
        return input.indexOf(search); // BUG: UseIndexOfChar
    
}

    public static void main(String[] args) {
        StringIndexChecker checker = new StringIndexChecker();
        System.out.println(checker.showBug("hello world", "d")); // This should return 10
    }
}