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

        // Inserting unreachable if-else statement
        boolean alwaysFalseCondition = getCondition();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the reachable else branch.");
        }
    }

    // Simulating a condition method for introducing an unreachable branch
    private static boolean getCondition() {
        return false; // This will always be false at runtime
    }
}