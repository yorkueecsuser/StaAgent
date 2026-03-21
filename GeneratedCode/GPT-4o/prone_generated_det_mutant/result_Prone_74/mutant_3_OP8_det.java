class IndexOfCharBugDemo {

    public int showBug(String str, int unicodeCodePoint, int startIndex) {
        // The bug is that the first argument should be a character, not a Unicode code point
        return str.indexOf(unicodeCodePoint, startIndex); // BUG: IndexOfChar
    }

    public static void main(String[] args) {
        IndexOfCharBugDemo demo = new IndexOfCharBugDemo();
        String lpgflvcg = "Example string with multiple words.";
        
        // Using a Unicode code point instead of a char
        int gbyjuzrx = 101; // Unicode for 'e'
        int mhjibpty = 0;
        int ahajubzq = demo.showBug(lpgflvcg, gbyjuzrx, mhjibpty);
        
        System.out.println("Index of the Unicode code point: " + ahajubzq);
    }
}