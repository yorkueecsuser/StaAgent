class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        boolean conditionWhile = false; // Mutant: Unreachable while loop
        while (conditionWhile) {
            System.out.println("This code will never be executed");
        }
        return str.substring(index, str.length());
    }

    public char showBugCharAt(String str, int index) {
        boolean conditionIf = false; // Mutant: Unreachable if statement
        if (conditionIf) {
            System.out.println("This code will never be executed");
        }
        return str.charAt(index);
    }
}