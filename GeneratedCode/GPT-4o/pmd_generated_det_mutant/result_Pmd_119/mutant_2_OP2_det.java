class StringIndexChecker {

    public int showBug(String input, String search) {
        // This line contains the bug: using String.indexOf(String) with a single character
        return input.indexOf(search); // BUG: UseIndexOfChar
    }
public static void main(String [] args){
    StringIndexChecker checker = new StringIndexChecker();
    checker = new StringIndexChecker();
    System.out.println(checker.showBug("hello world" , "d"));
}
}