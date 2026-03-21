class IndexOfCharBugDemo {

    public int showBug(String str, int unicodeCodePoint, int startIndex) {
        // The bug is that the first argument should be a character, not a Unicode code point
        return str.indexOf(unicodeCodePoint, startIndex); // BUG: IndexOfChar
    }
public static void main(String [] args){
    IndexOfCharBugDemo demo = new IndexOfCharBugDemo();
    String example = "Example string with multiple words.";
    example = "Example string with multiple words.";
    int unicodeCodePoint = 101;
    int startIndex = 0;
    int index = demo.showBug(example , unicodeCodePoint , startIndex);
    System.out.println("Index of the Unicode code point: " + index);
}
}