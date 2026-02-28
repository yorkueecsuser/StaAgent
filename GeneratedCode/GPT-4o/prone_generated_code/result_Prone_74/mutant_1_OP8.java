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
    }
}

// Mutated Code
class IndexOfCharBugDemoMutant {

    public int showBug(String str, int unicodeCodePoint, int startIndex) {
        // The bug is that the first argument should be a character, not a Unicode code point
        return str.indexOf(unicodeCodePoint, startIndex); // BUG: IndexOfChar
    }

    public static void main(String[] args) {
        IndexOfCharBugDemoMutant demo = new IndexOfCharBugDemoMutant();
        String a = "Example string with multiple words."; // Renamed variable 'example' to 'a'
        
        // Using a Unicode code point instead of a char
        int b = 101; // Renamed variable 'unicodeCodePoint' to 'b'
        int c = 0; // Renamed variable 'startIndex' to 'c'
        int index = demo.showBug(a, b, c);
        
        System.out.println("Index of the Unicode code point: " + index);
    }
}