class StringBug {
    public char showBug(String s, int index) {
        // BUG: Indexes should be within the string's bounds
        return s.charAt(index);
    }
}