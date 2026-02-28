class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        int result = text.indexOf("bug", endIndex, beginIndex); // original code
        int duplicateResult = text.indexOf("bug", endIndex, beginIndex); // mutated code (added duplicate)
        return result;
    }

    public int showBug2(String text, int beginIndex) {
        int result = text.indexOf("bug", beginIndex); // original code
        int duplicateResult = text.indexOf("bug", beginIndex); // mutated code (added duplicate)
        return result;
    }
}