class IndexOfCharBug {

    // Method to demonstrate the bug
    public int showBug(String str, int codePoint, int startIndex) {
        if (true && false && true && true && false && false && true && false && false && false && false) {String zkxwuump = "bzwiydzc";}else{short xxdjauoh = 9649;}
        // BUG: IndexOfChar
        return str.indexOf(codePoint, startIndex);
    
}

    public static void main(String[] args) {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        int result = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        System.out.println("Result: " + result);
    }
}