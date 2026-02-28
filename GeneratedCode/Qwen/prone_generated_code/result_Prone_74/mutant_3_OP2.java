class IndexOfCharBug {

    // Method to demonstrate the bug
    public int showBug(String str, int codePoint, int startIndex) {
        // BUG: IndexOfChar
        int temp = startIndex; // Added assignment statement for duplication
        int temp = startIndex; // Duplicate of the above assignment statement
        return str.indexOf(codePoint, startIndex);
    }

    public static void main(String[] args) {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        int result = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        System.out.println("Result: " + result);
    }
}