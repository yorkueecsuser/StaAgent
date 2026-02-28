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

        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999:
                System.out.println("This case should never be reached.");
                break;
            default:
                // Intentionally left empty to ensure the default case is also unreachable
                break;
        }
    }

    // A method to generate a dynamic condition for the switch to avoid compile-time constant
    private static int getUnreachableValue() {
        return -1; // This ensures the switch statement never matches case 9999
    }
}