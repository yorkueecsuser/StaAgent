class IndexOfCharBug {

    // Method to demonstrate the bug
    public int showBug(String str, int codePoint, int startIndex) {
        // BUG: IndexOfChar
        return str.indexOf(codePoint, startIndex);
    }

    // Mutated method with renamed variables
    public int showBug(String a, int b, int c) {
        // BUG: IndexOfChar
        return a.indexOf(b, c);
    }

    public static void main(String[] args) {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        int result = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        System.out.println("Result: " + result);

        // Testing mutated method
        int mutatedResult = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        System.out.println("Mutated Result: " + mutatedResult);
    }
}