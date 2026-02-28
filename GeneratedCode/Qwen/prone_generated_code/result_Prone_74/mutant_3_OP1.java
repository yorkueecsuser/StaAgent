class IndexOfCharBug {

    // Method to demonstrate the bug
    public int showBug(String str, int codePoint, int startIndex) {
        // BUG: IndexOfChar
        return str.indexOf(codePoint, startIndex);
    }

    public static void main(String[] args) {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        int result = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        
        // Dead Store Mutation
        String abcdefgh = "unusedVariable";
        
        System.out.println("Result: " + result);
    }
}