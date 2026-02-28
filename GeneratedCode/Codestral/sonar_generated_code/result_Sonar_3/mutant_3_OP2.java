class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        int originalResult = text.indexOf("bug", endIndex, beginIndex);
        // Mutation: Duplicating the return statement
        int duplicatedResult = text.indexOf("bug", endIndex, beginIndex);
        return originalResult; // Keeping the original statement for correctness
    }

    public int showBug2(String text, int beginIndex) {
        int originalResult = text.indexOf("bug", beginIndex);
        // Mutation: Duplicating the return statement
        int duplicatedResult = text.indexOf("bug", beginIndex);
        return originalResult; // Keeping the original statement for correctness
    }
}