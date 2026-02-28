class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        int a = beginIndex; // Renamed beginIndex to a
        int b = endIndex;   // Renamed endIndex to b
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", b, a); // Using renamed variables
    }

    public int showBug2(String text, int beginIndex) {
        int c = beginIndex; // Renamed beginIndex to c
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", c); // Using renamed variable
    }
}