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

        // Unreachable switch statement mutation
        boolean switchCondition = alwaysFalse();
        int someValue = switchCondition ? 1 : 0;
        switch (someValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case to ensure no compile-time errors
                break;
        }
    }

    // Method to ensure the switch statement is unreachable
    private static boolean alwaysFalse() {
        return false;
    }
}