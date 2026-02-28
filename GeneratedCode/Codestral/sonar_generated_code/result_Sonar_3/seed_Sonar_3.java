class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }
}