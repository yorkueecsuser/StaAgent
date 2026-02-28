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
        
        // Introducing an unreachable while loop
        boolean isUnreachableConditionMet = getUnreachableCondition();
        while (isUnreachableConditionMet) {
            // This block is unreachable due to the condition being false
            System.out.println("This will never be printed.");
        }
    }
    
    // Method to simulate a dynamic condition that returns false at runtime
    public static boolean getUnreachableCondition() {
        return false; // This makes the while loop unreachable
    }
}