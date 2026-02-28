class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        int index = text.indexOf("bug", endIndex, beginIndex); // original code
        int duplicateIndex = index; // new mutant code
        return index;
    }

    public int showBug2(String text, int beginIndex) {
        int index = text.indexOf("bug", beginIndex); // original code
        int duplicateIndex = index; // new mutant code
        return index;
    }
}