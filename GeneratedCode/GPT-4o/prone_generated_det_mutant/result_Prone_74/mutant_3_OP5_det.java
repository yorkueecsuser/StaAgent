class IndexOfCharBugDemo {

    public int showBug(String str, int unicodeCodePoint, int startIndex) {
        int spxfaszs = 0;switch  (spxfaszs) {case 1:int brzamvxw = -396334072;break;default:byte yuntonjv = -22;break;}
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
    }
}