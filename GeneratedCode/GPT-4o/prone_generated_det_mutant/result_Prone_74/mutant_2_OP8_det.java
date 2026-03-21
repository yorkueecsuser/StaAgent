class IndexOfCharBugDemo {

    public int showBug(String str, int unicodeCodePoint, int startIndex) {
        // The bug is that the first argument should be a character, not a Unicode code point
        return str.indexOf(unicodeCodePoint, startIndex); // BUG: IndexOfChar
    }

    public static void main(String[] args) {
        IndexOfCharBugDemo demo = new IndexOfCharBugDemo();
        String avnigerr = "Example string with multiple words.";
        
        // Using a Unicode code point instead of a char
        int pneoakmc = 101; // Unicode for 'e'
        int bbysvhmc = 0;
        int fwmmzubt = demo.showBug(avnigerr, pneoakmc, bbysvhmc);
        
        System.out.println("Index of the Unicode code point: " + fwmmzubt);
    }
}