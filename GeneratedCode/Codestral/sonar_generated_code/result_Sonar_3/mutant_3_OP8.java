class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        int z = beginIndex;
        beginIndex = endIndex;
        endIndex = z;
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", beginIndex, endIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        int z = beginIndex;
        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", z); // z < 0
    }
}