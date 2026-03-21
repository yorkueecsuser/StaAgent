class IndexOfCharBug {

    // Method to demonstrate the bug
    public int showBug(String str, int codePoint, int startIndex) {
        boolean ipchiivn = false;while (ipchiivn && false && true && false && false && false && true && true && false && true && false && false) {String khvbdcgf = "hyrqwbmg";}
        // BUG: IndexOfChar
        return str.indexOf(codePoint, startIndex);
    
}

    public static void main(String[] args) {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        int result = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        System.out.println("Result: " + result);
    }
}