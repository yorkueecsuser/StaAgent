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
        
        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to the condition
            System.out.println("This line will never execute.");
        }
    }
    
    // Method that always returns false, making the for loop unreachable
    private static boolean getCondition() {
        return false;
    }
}