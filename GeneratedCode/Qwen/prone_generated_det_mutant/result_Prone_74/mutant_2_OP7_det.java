class IndexOfCharBug {

    // Method to demonstrate the bug
    public int showBug(String str, int codePoint, int startIndex) {
        boolean ixfhgdwo = false;while (ixfhgdwo && true && false && false && false && true && true && true && true && true && true && false) {double vdpwrujc = 323312508;}
        // BUG: IndexOfChar
        return str.indexOf(codePoint, startIndex);
    
}

    public static void main(String[] args) {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        int result = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        System.out.println("Result: " + result);
    }
}