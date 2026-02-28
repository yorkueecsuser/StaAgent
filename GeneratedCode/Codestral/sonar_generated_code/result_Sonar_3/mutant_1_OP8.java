class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        int e = endIndex;
        int b = beginIndex;
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", e, b); // b > e
    }

    public int showBug2(String text, int beginIndex) {
        int b = beginIndex;
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", b); // b < 0
    }
}