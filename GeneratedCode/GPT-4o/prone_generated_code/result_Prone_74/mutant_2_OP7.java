class IndexOfCharBugDemo {

    public int showBug(String str, int unicodeCodePoint, int startIndex) {
        // The bug is that the first argument should be a character, not a Unicode code point
        return str.indexOf(unicodeCodePoint, startIndex); // BUG: IndexOfChar
    }

    public static void main(String[] args) {
        IndexOfCharBugDemo demo = new IndexOfCharBugDemo();
        String example = "Example string with multiple words.";
        
        // Using a Unicode code point instead of a char
        int unicodeCodePoint = 101; // Unicode for 'e'
        int startIndex = 0;
        int index = demo.showBug(example, unicodeCodePoint, startIndex);
        
        System.out.println("Index of the Unicode code point: " + index);

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition(); // This method should return false
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
    }
    
    // This method is used to ensure the loop is unreachable
    private static boolean getCondition() {
        return false;
    }
}